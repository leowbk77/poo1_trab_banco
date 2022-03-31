package trab.poo1_trab_banco;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;

public class HomepageControl {
    // HOMEPAGE.FXML
    @FXML
    Button botao1;
    @FXML
    Button botao2;
    @FXML
    Button botao3;
    @FXML
    Button botao4;

    // TELA-TESTE.FXML
    @FXML
    private Label labelteste;
    @FXML
    private TextField campodetxt;
    @FXML
    private TextField campodetxt1;

    // DEMAIS VARS
    private String camposDetxt;

    /*
    AQUI FALTA CRIAR UM MERODO UNICO PARA ABRIR AS OUTRAS JANELAS
    PASSANDO SOMENTE O NOME DO .FXML
    ISSO DIMINUI O NUMERO DE METODOS PARA SEREM CHAMADOS
    COMO CARALHOS FAAZER ISSO COM DIFERENTES BOTOES?
    CONTINUA TENDO UMA CARALHADA DE METODO, POREM TODOS CHAMAM O MESMO PASSANDO APENAS O NOME DE PARAMETRO
    (???????????)
     */
    
    @FXML
    public void ir_para_telaTeste(ActionEvent event) throws IOException{
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("clientes.fxml"));

            Scene cena = new Scene(fxmlLoader.load(), 800, 600);

            Stage stage1 = new Stage();
            stage1.setTitle("New Window");
            stage1.setScene(cena);
            stage1.show();

        } catch (IOException e) {
            System.out.println("EXCEPTION" + e.getMessage());
        }
        
        /* PULA A JANELA
        parent = FXMLLoader.load(getClass().getResource("Tela-teste.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(parent, 800,600);
        stage.setScene(scene);
        stage.show();
        */
    }

    @FXML
    public void ir_para_control(ActionEvent event) throws IOException{

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("testecomunicacao.fxml"));

            Scene cena = new Scene(loader.load(), 800, 600);

            Comunicacaocontrol control = loader.getController(); // COMUNICA ENTRE OS CONTROLERS (APOS O LOAD NA CENA NA LINHA DE CIMA)
            System.out.println(control.textoAntigo());
            control.textoChange("Hello");

            Stage stage1 = new Stage();

            stage1.setTitle("New Window");
            stage1.setScene(cena);
                stage1.show();
            } catch (IOException e) {
            System.out.println("EXCEPTION" + e.getMessage());
        }

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
    }

    @FXML
    protected void metodoqualquer(){
        camposDetxt = campodetxt.getText();

        try{
            int campo2 = Integer.parseInt(campodetxt1.getText());
            campo2++;
            System.out.println("Valor inserido + 1: " + campo2);
        }catch (NumberFormatException e){
            System.out.println("Invalid Input");
        }

        campodetxt.clear();
        campodetxt1.clear();
        
        labelteste.setFont(Font.font("comic sans ms", 20));
        labelteste.setText(camposDetxt);
    }

}
