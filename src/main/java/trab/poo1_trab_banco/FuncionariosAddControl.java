package trab.poo1_trab_banco;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import trab.poo1_trab_banco.models.Cliente;
import trab.poo1_trab_banco.models.Funcionario;

import java.io.IOException;
import java.time.ZonedDateTime;
import java.util.LinkedList;

public class FuncionariosAddControl {
    // temporario
    private LinkedList<Funcionario> listaTempDeFuncionarios;

    //funcionariosAdd.fxml
    @FXML
    Button botaoAdd2;
    @FXML
    TextField campoDeNome;
    @FXML
    TextField campoDeCPF;
    @FXML
    DatePicker dataPick;
    @FXML
    TextField campoDeFone;

    @FXML
    private FuncionariosControl origem;

    @FXML
    public void minhaOrigem(FuncionariosControl origem){
        this.origem = origem;
    }

    @FXML
    public void adicionaFuncionario(ActionEvent event) throws IOException {

        Funcionario novoFuncionario = new Funcionario(campoDeNome.getText(),
                                                    campoDeCPF.getText(),
                                                    campoDeFone.getText(),
                                                    ZonedDateTime.now(),
                                                    0,
                                                    origem.pegarAgenciaFic());
        origem.addFuncionarioNoBanco(novoFuncionario);
        origem.addFuncionarioNoHash(novoFuncionario);
        origem.addFuncionarioNoListView(novoFuncionario.getNome());

        // antigo
//        if(listaTempDeFuncionarios == null){
//            listaTempDeFuncionarios = new LinkedList<Funcionario>();
//            listaTempDeFuncionarios.add(new Funcionario(campoDeNome.getText(),
//                                                        campoDeCPF.getText(),
//                                                        campoDeFone.getText(),
//                                                        ZonedDateTime.now(),
//                                                        0,
//                                                        origem.pegarAgenciaFic()));
//
//            origem.addFuncionarioNoListView(listaTempDeFuncionarios.getLast().getNome());
//
//        }else{
//            listaTempDeFuncionarios.add(new Funcionario(campoDeNome.getText(),
//                                                        campoDeCPF.getText(),
//                                                        campoDeFone.getText(),
//                                                        ZonedDateTime.now(),
//                                                        0,
//                                                        origem.pegarAgenciaFic()));
//
//            origem.addFuncionarioNoListView(listaTempDeFuncionarios.getLast().getNome());
//        }
    }

    @FXML
    public void printaFuncionario(ActionEvent event) throws IOException {
        listaTempDeFuncionarios.getLast().imprimePessoa();
    }
}
