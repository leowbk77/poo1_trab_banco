package trab.poo1_trab_banco;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class HomepageControl {
    // Referencias para os controladores das telas? (talvez necessario para o futuro)
    @FXML
    private ClientesControl contraladorDoClientes;
    @FXML
    private FuncionariosControl controladorDoFuncionarios;
    @FXML
    private ContasControl controladorDoContas;

    // HOMEPAGE.FXML
    @FXML
    Button botao1;
    @FXML
    Button botao2;
    @FXML
    Button botao3;
    
    @FXML
    public void ir_para_clientes(ActionEvent event) throws IOException{
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("clientes.fxml"));

            Scene cena = new Scene(fxmlLoader.load(), 800, 600);

            Stage stage1 = new Stage();
            stage1.setTitle("Clientes");
            stage1.setScene(cena);
            stage1.show();

        } catch (IOException e) {
            System.out.println("EXCEPTION" + e.getMessage());
        }
    }

    @FXML
    public void ir_para_funcionarios(ActionEvent event) throws IOException{
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("funcionarios.fxml"));

            Scene cena = new Scene(fxmlLoader.load(), 800, 600);

            Stage stage1 = new Stage();
            stage1.setTitle("Funcionarios");
            stage1.setScene(cena);
            stage1.show();

        } catch (IOException e) {
            System.out.println("EXCEPTION" + e.getMessage());
        }
    }

    @FXML
    public void ir_para_contas(ActionEvent event) throws IOException{
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("contas.fxml"));

            Scene cena = new Scene(fxmlLoader.load(), 800, 600);

            Stage stage1 = new Stage();
            stage1.setTitle("Contas");
            stage1.setScene(cena);
            stage1.show();
        } catch (IOException e){
            System.out.println("EXCEPTION" + e.getMessage());
        }
    }
}

        /* PULA A JANELA - !!!! DESCONSIDERAR !!!!
        parent = FXMLLoader.load(getClass().getResource("Tela-teste.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(parent, 800,600);
        stage.setScene(scene);
        stage.show();
        */

        /* PULA A JANELA
        FXMLLoader loader = new FXMLLoader(getClass().getResource("testecomunicacao.fxml"));
        parent = loader.load();

        Comunicacaocontrol controladorteste = loader.getController();
        System.out.println(controladorteste.textoAntigo());

        controladorteste.textoChange("NovoTexto");

        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(parent, 800, 600);
        stage.setScene(scene);
        stage.show();
         */