package trab.poo1_trab_banco;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.Stage;
import trab.poo1_trab_banco.models.Agencia;
import trab.poo1_trab_banco.models.Banco;
import trab.poo1_trab_banco.models.Endereco;

import java.io.IOException;
import java.util.LinkedList;

public class ContasControl {
    @FXML
    private Banco banco;

    // contas.fxml
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
    ListView<String> ListaDeContasView;

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
    public void setBanco(Banco banco){
        this.banco = banco;
    }

    @FXML
    public void addContaNoListView(String nome){
        if(ListaDeContasView == null){
            ListaDeContasView = new ListView<String>();
            ListaDeContasView.getItems().add(nome);
        }else{
            ListaDeContasView.getItems().add(nome);
        }
    }

}
