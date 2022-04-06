package trab.poo1_trab_banco;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.Stage;
import trab.poo1_trab_banco.models.*;

import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.LinkedList;

public class ContasControl {
    // referencia do banco para acesso aos dados
    @FXML
    private Banco banco;

    private HashMap<String, Conta> mapaDeContas;

    // contas.fxml
    @FXML
    Button loadFromFile;
    @FXML
    Button saveToFile;
    @FXML
    Button reloadBtn;
    @FXML
    Label labelinfo2;
    @FXML
    Label labelinfo3;
    @FXML
    Label labelinfo4;
    @FXML
    Label labelinfo5;
    @FXML
    Label labelinfo6;
    @FXML
    Label labelinfo7;
    @FXML
    Label labelinfo8;
    @FXML
    Label labelinfo9;
    @FXML
    ListView<String> listaDeContasView;

    @FXML
    public void telaDeAdicao(ActionEvent event) throws IOException {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("contasAdd.fxml"));

            Scene cena = new Scene(fxmlLoader.load(), 800, 600);

            ContasAddControl controladorDoAdd = fxmlLoader.getController();
            controladorDoAdd.minhaOrigem(this);

            Stage stage1 = new Stage();
            stage1.setTitle("Adicao de Conta");
            stage1.setScene(cena);
            stage1.show();

        }catch (IOException e){
            System.out.println("EXCEPTION" + e.getMessage());
        }
    }

    @FXML
    public void addContaNoHash(Conta conta){
        if(mapaDeContas == null){
            mapaDeContas = new HashMap<String, Conta>();
            mapaDeContas.put(conta.getID(), conta);
        }else{
            mapaDeContas.put(conta.getID(), conta);
        }
    }

    @FXML
    public void addContaNoBanco(Conta conta){
        banco.add_conta(conta);
    }

    @FXML
    public void populate(){
        if(banco.numeroDeContas() != 0){
            LinkedList<Conta> contasDoBanco = banco.getContas();

            for(Conta e : contasDoBanco){
                listaDeContasView.getItems().add(e.getID());
                addContaNoHash(e);
            }
        }
    }

    @FXML
    public void reloadBtn(ActionEvent event) throws IOException{
        listaDeContasView.getItems().clear();
        populate();
    }

    @FXML
    public void loadBtnAct(ActionEvent event) throws IOException {
        String itemSelecionado = listaDeContasView.getSelectionModel().getSelectedItem();
        loadInfos(itemSelecionado);
    }

    @FXML
    private void loadInfos(String item){
        Conta temp = mapaDeContas.get(item);
        String dtCriacao = temp.getDtCriacao().format(DateTimeFormatter.ISO_DATE);
        String ultimoAcesso = temp.getUltimoAcesso().format(DateTimeFormatter.ISO_DATE);
        labelinfo2.setText(temp.getID());
        labelinfo5.setText(dtCriacao);
        labelinfo6.setText(ultimoAcesso);
        if (temp instanceof ContaPoupanca) {
            Double valorJuros = ((ContaPoupanca) temp).getTaxaJuros();
            labelinfo7.setText(valorJuros.toString());
        } else if (temp instanceof ContaCorrente) {
            Double valorTarifa = ((ContaCorrente) temp).getTarifaMensal();
            labelinfo7.setText(valorTarifa.toString());
        }
    }

    @FXML
    public void setBanco(Banco banco){
        this.banco = banco;
    }

    @FXML
    public void addContaNoListView(String nome){
        if(listaDeContasView == null){
            listaDeContasView = new ListView<String>();
            listaDeContasView.getItems().add(nome);
        }else{
            listaDeContasView.getItems().add(nome);
        }
    }

    @FXML
    public void fileSave(ActionEvent event) throws IOException {
        banco.writeContasToFile();
    }

    @FXML
    public void fileLoad(ActionEvent event) throws IOException {
        banco.readContasFromFile();
    }
}
