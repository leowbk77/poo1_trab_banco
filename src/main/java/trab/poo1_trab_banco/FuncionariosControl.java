package trab.poo1_trab_banco;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.Stage;
import trab.poo1_trab_banco.models.Agencia;
import trab.poo1_trab_banco.models.Banco;
import trab.poo1_trab_banco.models.Endereco;

import java.io.IOException;
import java.util.LinkedList;

public class FuncionariosControl {
    // referencia do banco para acesso aos dados
    @FXML
    private Banco banco;

    // temp
    private LinkedList<Agencia> ListaDeAgencias;

    // funcionarios.fxml
    @FXML
    Button botao1;
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
