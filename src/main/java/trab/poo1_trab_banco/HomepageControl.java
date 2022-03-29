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

    // REFERENCIAS DA MUDANCA DE TELA
    private Stage stage;
    private Scene scene;
    private Parent parent;

    @FXML
    public void ir_para_home(ActionEvent event) throws IOException {
        parent = FXMLLoader.load(getClass().getResource("homepage.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML
    public void ir_para_telaTeste(ActionEvent event) throws IOException{
        parent = FXMLLoader.load(getClass().getResource("Tela-teste.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(parent, 800,600);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void alteraFonte(){
        labelteste.setFont(Font.font("comic sans ms", 20));
    }

    @FXML
    protected void metodoqualquer(){
        campodetxt.clear();
        campodetxt1.clear();
        alteraFonte();
    }
}
