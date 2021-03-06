package trab.poo1_trab_banco;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.Stage;
import trab.poo1_trab_banco.models.Banco;
import trab.poo1_trab_banco.models.Cliente;

import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.LinkedList;

public class ClientesControl {
    // referencia do banco para acesso aos dados
    @FXML
    private Banco banco;

    // mapa de clientes para exibir
    private HashMap<String, Cliente> mapaDeClientes;

    // clientes.fxml
    @FXML
    Button botao1;
    @FXML
    Button loadBtn;
    @FXML
    Button loadFromFile;
    @FXML
    Button saveToFile;
    @FXML
    Button reloadBtn;
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

    @FXML
    public void addClienteNoHash(Cliente cliente){
        if(mapaDeClientes == null){
            mapaDeClientes = new HashMap<String, Cliente>();
            mapaDeClientes.put(cliente.getNome(), cliente);
        }else{
            mapaDeClientes.put(cliente.getNome(), cliente);
        }
    }

    @FXML
    public void addClienteNoBanco(Cliente cliente){
        banco.add_cliente(cliente);
    }

    @FXML
    public void populate(){
        if(banco.numeroDeClientes() != 0){
            LinkedList<Cliente> clientesDoBanco = banco.getClientes();

            for(Cliente e : clientesDoBanco){
                listaDeClientesView.getItems().add(e.getNome());
                addClienteNoHash(e);
            }
        }
    }

    @FXML
    public void reloadBtn(ActionEvent event) throws IOException{
        listaDeClientesView.getItems().clear();
        populate();
    }

    @FXML
    public void loadBtnAct(ActionEvent event) throws IOException {
        String itemSelecionado = listaDeClientesView.getSelectionModel().getSelectedItem();
        loadInfos(itemSelecionado);
    }

    @FXML
    private void loadInfos(String item){
        Cliente tempCliente = mapaDeClientes.get(item);
        String nasc = tempCliente.getNascimento().format(DateTimeFormatter.ISO_DATE);
        labelinfo2.setText(tempCliente.getNome());
        labelinfo3.setText(tempCliente.getCpf());
        labelinfo4.setText(nasc);
        labelinfo5.setText(tempCliente.getEnderecoCliente().getEndToString());
    }

    @FXML
    public void setBanco(Banco banco){
        this.banco = banco;
    }

    @FXML
    public void fileSave(ActionEvent event) throws IOException {
        banco.writeClientesToFile();
    }

    @FXML
    public void fileLoad(ActionEvent event) throws IOException {
        banco.readClientesFromFile();
    }
}
