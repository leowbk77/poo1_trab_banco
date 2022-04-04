package trab.poo1_trab_banco;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import java.io.IOException;

public class ClientesControl {
    // temporario
    // private LinkedList<Cliente> listaTempDeClientes;

    // clientes.fxml
    @FXML
    Button botao1;
    @FXML
    ListView<String> listaDeClientesView;
    @FXML
    Label labelinfo2;
    @FXML
    Label labelinfo3;
    @FXML
    Label labelinfo4;
    @FXML
    Label labelinfo5;

    @FXML
    public void telaDeAdicao(ActionEvent event) throws IOException {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("clientesAdd.fxml"));

            Scene cena = new Scene(fxmlLoader.load(), 800, 600);

            ClienteAddControl controladorDoAdd = fxmlLoader.getController();
            controladorDoAdd.minhaOrigem(this);

            Stage stage1 = new Stage();
            stage1.setTitle("Adicao de cliente");
            stage1.setScene(cena);
            stage1.show();

        }catch (IOException e){
            System.out.println("EXCEPTION" + e.getMessage());
        }
    }

    @FXML
    public void addClienteNoListView(String nome){
        if(listaDeClientesView == null){
            listaDeClientesView = new ListView<String>();
            listaDeClientesView.getItems().add(nome);
        }else{
            listaDeClientesView.getItems().add(nome);
        }
    }
}
