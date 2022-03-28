package trab.poo1_trab_banco;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;

public class TesteControl {
    @FXML
    private Label labelteste;

    @FXML
    private TextField campodetxt;

    @FXML
    private TextField campodetxt1;

    @FXML
    protected void alteraFonte(){
        labelteste.setFont(Font.font("comic sans ms", 20));
    }

    @FXML
    protected void botaoClick(){
        alteraFonte();
    }

    @FXML
    protected void metodoqualquer(){
        campodetxt.clear();
        campodetxt1.clear();
    }

}
