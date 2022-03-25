package trab.poo1_trab_banco;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.text.Font;

public class TesteControl {
    @FXML
    private Label labelteste;

    @FXML
    protected void alteraFonte(){
        labelteste.setFont(Font.font("comic sans ms", 20));
    }

    @FXML
    protected void botaoClick(){
        alteraFonte();
    }

}
