package trab.poo1_trab_banco;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class Comunicacaocontrol {
    @FXML
    Label labelTeste;

    @FXML
    Button botaoDeRetorno;


    @FXML
    public void novaJanela(ActionEvent event) throws  IOException{
        try {

            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("testecomunicacao.fxml"));
            /*
             * if "fx:controller" is not set in fxml
             * fxmlLoader.setController(NewWindowController);
             */
            Scene cena = new Scene(fxmlLoader.load(), 800, 600); //630 400
            Stage stage1 = new Stage();
            stage1.setTitle("New Window");
            stage1.setScene(cena);
            stage1.show();

        } catch (IOException e) {
            System.out.println("EXCEPTION");
        }
    }

    @FXML
    public void textoChange(String texto) throws IOException{
        labelTeste.setText(texto);
    }

    @FXML
    public String textoAntigo(){
        return labelTeste.getText();
    }
}
