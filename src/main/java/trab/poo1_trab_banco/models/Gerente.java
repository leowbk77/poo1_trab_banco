package trab.poo1_trab_banco.models;

import java.time.ZonedDateTime;
import java.util.Date;

public class Gerente extends Funcionario{
    public Gerente(String nome, String cpf, String fone, Date admissao, int tempoServico, Agencia agencia) {
        super(nome, cpf, fone, admissao, tempoServico, agencia);
    }
}
