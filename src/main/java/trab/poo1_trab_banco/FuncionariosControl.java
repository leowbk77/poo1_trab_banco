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
import java.util.HashMap;
import java.util.LinkedList;

public class FuncionariosControl {
    // referencia do banco para acesso aos dados
    @FXML
    private Banco banco;

    private HashMap<String, Funcionario> mapaDeFuncionarios;

    // temp
    private LinkedList<Agencia> ListaDeAgencias;

    // funcionarios.fxml
    @FXML
    Button botao1;
    @FXML
    Button loadBtn;
    @FXML
    ListView<String> listaDeFuncionariosView; // isso aqui vai se tornar uma lista de funcionarios (String temporario para facilitar exibicao)
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
    public void telaDeAdicao(ActionEvent event) throws IOException {
        try {
            // criando uma agencia ficticia para adicionar os funcionarios caso nao tenha agencia criada
            if(ListaDeAgencias == null){
                Endereco enderecoDaAgencia = new Endereco();
                Agencia agenciaFicticia = new Agencia("AgenciaTeste", enderecoDaAgencia);
                ListaDeAgencias = new LinkedList<Agencia>();
                ListaDeAgencias.add(agenciaFicticia);
            }

            // cria a tela
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("funcionariosAdd.fxml"));

            Scene cena = new Scene(fxmlLoader.load(), 800, 600);

            FuncionariosAddControl controladorDoAdd = fxmlLoader.getController();
            controladorDoAdd.minhaOrigem(this);

            Stage stage1 = new Stage();
            stage1.setTitle("Adicao de funcionario");
            stage1.setScene(cena);
            stage1.show();

        }catch (IOException e){
            System.out.println("EXCEPTION" + e.getMessage());
        }
    }

    @FXML
    public void addFuncionarioNoListView(String nome){
        if(listaDeFuncionariosView == null){
            listaDeFuncionariosView = new ListView<String>();
            listaDeFuncionariosView.getItems().add(nome);
        }else{
            listaDeFuncionariosView.getItems().add(nome);
        }
    }

    @FXML
    public void addFuncionarioNoHash(Funcionario funcionario){
        if(mapaDeFuncionarios == null){
            mapaDeFuncionarios = new HashMap<String, Funcionario>();
            mapaDeFuncionarios.put(funcionario.getNome(), funcionario);
        }else{
            mapaDeFuncionarios.put(funcionario.getNome(), funcionario);
        }
    }

    @FXML
    public void addFuncionarioNoBanco(Funcionario funcionario){
        banco.add_funcionario(funcionario);
    }

    @FXML
    public void populate(){
        // se o listview for nulo a tela é nova
        // se a lista de clientes estiver vazia nao ha o que popular no listview
        if(banco.numeroDeFuncionarios() != 0){
            LinkedList<Funcionario> funcionariosDoBanco = banco.getFuncionarios();

            for(Funcionario e : funcionariosDoBanco){
                listaDeFuncionariosView.getItems().add(e.getNome());
                addFuncionarioNoHash(e);
            }
        }
    }

    @FXML
    public void loadBtnAct(ActionEvent event) throws IOException {
        String itemSelecionado =  listaDeFuncionariosView.getSelectionModel().getSelectedItem();
        loadInfos(itemSelecionado);
    }

    @FXML
    private void loadInfos(String item){
        Funcionario tempFuncionario = mapaDeFuncionarios.get(item);
        labelinfo2.setText(tempFuncionario.getNome());
        labelinfo3.setText(tempFuncionario.getFone());
//        labelinfo4.setText(tempFuncionario.getSupervisor().getNome());
//        labelinfo6.setText(tempFuncionario.getAgencia().getNome());
    }

    @FXML
    public void setBanco(Banco banco){
        this.banco = banco;
    }

    @FXML
    public void setListaDeAgencias(LinkedList<Agencia> ListaDeAgencias){
        this.ListaDeAgencias = ListaDeAgencias;
    }

    @FXML
    public Agencia pegarAgenciaFic(){
        return ListaDeAgencias.getLast();
    }

}
