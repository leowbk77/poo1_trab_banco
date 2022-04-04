package trab.poo1_trab_banco.models;

import java.time.ZonedDateTime;

public class Gerente extends Funcionario{
    public Gerente(String nome, String cpf, String fone, ZonedDateTime admissao, int tempoServico) {
        super(nome, cpf, fone, admissao, tempoServico);
    }
}
