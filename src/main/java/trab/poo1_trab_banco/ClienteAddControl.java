package trab.poo1_trab_banco;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import trab.poo1_trab_banco.models.Cliente;

import java.io.IOException;
import java.time.ZonedDateTime;
import java.util.LinkedList;

public class ClienteAddControl {
    // temporario
    //private LinkedList<Cliente> listaTempDeClientes;

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
                                            ZonedDateTime.now(),
                                            campoDeCidade.getText(),
                                            campoDeEstado.getText(),
                                            campoDeEndereco.getText());
        origem.addClienteNoBanco(novoCliente);
        origem.addClienteNoHash(novoCliente);
        origem.addClienteNoListView(novoCliente.getNome());


        /* CODIGO ANTIGO
        if(listaTempDeClientes == null){
            listaTempDeClientes = new LinkedList<Cliente>();
            listaTempDeClientes.add(new Cliente(campoDeNome.getText(),
                                                campoDeCPF.getText(),
                                                ZonedDateTime.now(),
                                                campoDeCidade.getText(),
                                                campoDeEstado.getText(),
                                                campoDeEndereco.getText()));

            origem.addClienteNoListView(listaTempDeClientes.getLast().getNome());

        }else{
            listaTempDeClientes.add(new Cliente(campoDeNome.getText(),
                                                campoDeCPF.getText(),
                                                ZonedDateTime.now(),
                                                campoDeCidade.getText(),
                                                campoDeEstado.getText(),
                                                campoDeEndereco.getText()));

            origem.addClienteNoListView(listaTempDeClientes.getLast().getNome());
        }
         */
    }

    //DEIXOU DE SER USAVEL
    @FXML
    public void printaCliente(ActionEvent event) throws IOException {
        //listaTempDeClientes.getLast().imprimeCliente();
        System.out.println("Nada a declarar");
    }

}
