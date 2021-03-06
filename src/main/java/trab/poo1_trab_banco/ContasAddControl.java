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
                ContaCorrente contaCorrente = new ContaCorrente(0.0, 10.0);
                listaDeContas.add(contaCorrente);
                origem.addContaNoListView(contaCorrente.getID());
                origem.addContaNoHash(contaCorrente);
                origem.addContaNoBanco(contaCorrente);

            }else{
                ContaPoupanca contaPoupanca = new ContaPoupanca(0.0, 10.0);
                listaDeContas.add(contaPoupanca);
                origem.addContaNoListView(contaPoupanca.getID());
                origem.addContaNoHash(contaPoupanca);
                origem.addContaNoBanco(contaPoupanca);
            }

        }else{
            if(selected == RadioCorrente){
                ContaCorrente contaCorrente = new ContaCorrente(0.0, 10.0);
                listaDeContas.add(contaCorrente);
                origem.addContaNoListView(contaCorrente.getID());
                origem.addContaNoHash(contaCorrente);
                origem.addContaNoBanco(contaCorrente);

            }else{
                ContaPoupanca contaPoupanca = new ContaPoupanca(0.0, 10.0);
                listaDeContas.add(contaPoupanca);
                origem.addContaNoListView(contaPoupanca.getID());
                origem.addContaNoHash(contaPoupanca);
                origem.addContaNoBanco(contaPoupanca);
            }
        }

    }
}
