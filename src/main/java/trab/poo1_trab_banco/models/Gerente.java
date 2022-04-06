package trab.poo1_trab_banco.models;

import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.Date;

public class Gerente extends Funcionario implements Serializable {
    public Gerente(String nome, String cpf, String fone, Date admissao, int tempoServico, Agencia agencia) {
        super(nome, cpf, fone, admissao, tempoServico, agencia);
    }
}
