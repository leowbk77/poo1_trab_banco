package trab.poo1_trab_banco;

import java.time.ZonedDateTime;

public class Gerente extends Funcionario{

    public Gerente(String nome, String cpf, String fone, ZonedDateTime admissao, ZonedDateTime tempoServico) {
        super(nome, cpf, fone, admissao, tempoServico);
    }

    public void tempMethod(int temp){
        super.numFuncional = temp;
    }
}
