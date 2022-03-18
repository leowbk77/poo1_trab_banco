package trab.poo1_trab_banco;

import java.util.Calendar;

public class Gerente extends Funcionario{

    public Gerente(String nome, String cpf, int numFuncional, String fone, Calendar admissao){
        super(nome, cpf, numFuncional, fone, admissao);
    }

    public void tempMethod(int temp){
        super.numFuncional = temp;
    }
}
