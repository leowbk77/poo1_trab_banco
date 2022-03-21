package trab.poo1_trab_banco;

import java.util.Calendar;

public class Gerente extends Funcionario{

    public Gerente(String nome, String cpf, String fone, Calendar admissao, Calendar tempoServico) {
        super(nome, cpf, fone, admissao, tempoServico);
    }

    public void tempMethod(int temp){
        super.numFuncional = temp;
    }
}
