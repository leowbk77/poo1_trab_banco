package trab.poo1_trab_banco;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import trab.poo1_trab_banco.models.Cliente;

import java.io.IOException;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.LinkedList;

public class ClienteAddControl {

    //clientesAdd.fxml
    @FXML
    Button botaoAdd2;
    @FXML
    TextField campoDeNome;
    @FXML
    TextField campoDeCPF;
    @FXML
    DatePicker dataPick;
    //>>Endereco
    @FXML
    TextField campoDeCidade;
    @FXML
    TextField campoDeEstado;
    @FXML
    TextField campoDeEndereco;

    @FXML
    private ClientesControl origem;

    @FXML
    public void minhaOrigem(ClientesControl origem){
        this.origem = origem;
    }

    @FXML
    public void adicionaCliente(ActionEvent event) throws IOException {
        Cliente novoCliente = new Cliente(campoDeNome.getText(),
                                            campoDeCPF.getText(),
                                            dataPick.getValue(),
                                            campoDeCidade.getText(),
                                            campoDeEstado.getText(),
                                            campoDeEndereco.getText());
        origem.addClienteNoBanco(novoCliente);
        origem.addClienteNoHash(novoCliente);
        origem.addClienteNoListView(novoCliente.getNome());
    }

    @FXML
    public void printaCliente(ActionEvent event) throws IOException {
        System.out.println("Nada a declarar");
    }

}
