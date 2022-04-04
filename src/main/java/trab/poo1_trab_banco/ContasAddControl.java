package trab.poo1_trab_banco;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import trab.poo1_trab_banco.models.Conta;
import trab.poo1_trab_banco.models.ContaCorrente;
import trab.poo1_trab_banco.models.ContaPoupanca;

import java.io.IOException;
import java.util.LinkedList;

public class ContasAddControl {
    // temp
    private LinkedList<Conta> listaDeContas;

    // contasAdd.fxml
    @FXML
    RadioButton RadioPoupanca;
    @FXML
    RadioButton RadioCorrente;
    @FXML
    Button botaoAdd2;

    // minha origem
    @FXML
    private ContasControl origem;

    @FXML
    public void minhaOrigem(ContasControl origem){
        this.origem = origem;
    }

    @FXML
    public void adicionaConta(ActionEvent event) throws IOException {
        ToggleGroup radioGroup = new ToggleGroup();
        RadioButton selected;
        RadioPoupanca.setToggleGroup(radioGroup);
        RadioCorrente.setToggleGroup(radioGroup);

        selected = (RadioButton) radioGroup.getSelectedToggle();

        if(listaDeContas == null){
            listaDeContas = new LinkedList<Conta>();

            if(selected == RadioCorrente){
                listaDeContas.add(new ContaCorrente(0.0, 10.0));
                origem.addContaNoListView(listaDeContas.getLast().getID());
            }else{
                listaDeContas.add(new ContaPoupanca(0.0, 5.0));
                origem.addContaNoListView(listaDeContas.getLast().getID());
            }

        }else{
            if(selected == RadioCorrente){
                listaDeContas.add(new ContaCorrente(0.0, 10.0));
                origem.addContaNoListView(listaDeContas.getLast().getID());
            }else{
                listaDeContas.add(new ContaPoupanca(0.0, 5.0));
                origem.addContaNoListView(listaDeContas.getLast().getID());
            }
        }

    }
}
