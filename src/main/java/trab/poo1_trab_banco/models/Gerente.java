package trab.poo1_trab_banco.models;

import java.io.Serializable;
import java.time.LocalDate;

public class Gerente extends Funcionario implements Serializable {
    public Gerente(String nome, String cpf, String fone, LocalDate admissao, int tempoServico, Agencia agencia) {
        super(nome, cpf, fone, admissao, tempoServico, agencia);
    }
}
