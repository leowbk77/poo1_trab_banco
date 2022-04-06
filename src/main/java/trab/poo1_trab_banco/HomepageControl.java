package trab.poo1_trab_banco;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import trab.poo1_trab_banco.models.Banco;

import java.io.IOException;

public class HomepageControl {

    // referencia do banco para acesso aos dados
    @FXML
    private Banco banco;

    // HOMEPAGE.FXML
    @FXML
    Button botao1;
    @FXML
    Button botao2;
    @FXML
    Button botao3;

    @FXML
    public void setBanco(Banco banco){
        this.banco = banco;
    }

    @FXML
    public void ir_para_clientes(ActionEvent event) throws IOException{
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("clientes.fxml"));

            Scene cena = new Scene(fxmlLoader.load(), 800, 600);

            ClientesControl controladorDaClientes = fxmlLoader.getController();
            controladorDaClientes.setBanco(banco);

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

            FuncionariosControl controladorDeFuncionarios = fxmlLoader.getController();
            controladorDeFuncionarios.setBanco(banco);

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

            ContasControl controladorDeContas = fxmlLoader.getController();
            controladorDeContas.setBanco(banco);

            Stage stage1 = new Stage();
            stage1.setTitle("Contas");
            stage1.setScene(cena);
            stage1.show();
        } catch (IOException e){
            System.out.println("EXCEPTION" + e.getMessage());
        }
    }
}
