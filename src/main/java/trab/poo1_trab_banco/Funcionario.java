package trab.poo1_trab_banco;

import java.util.Calendar;
import java.util.LinkedList;

public class Funcionario extends Pessoa{
    protected int numFuncional;
    protected String fone;

    protected LinkedList<String> dependentes; // ??
    protected Funcionario supervisor;
    protected Calendar admissao;

    public Funcionario(String nome, String cpf, int numFuncional, String fone, Calendar admissao){
        super(nome, cpf);
        this.numFuncional = numFuncional;
        this.fone = fone;
        this.admissao = admissao;
        this.supervisor = null;
    }

    public void setSupervisor(Funcionario supervisor){
        this.supervisor = supervisor;
    }

    public int tempoServico(){
        /* TEMPORARIO //
        // (alterar)  */
        Calendar temp = Calendar.getInstance(); // pega o tempo atual
        return temp.get(Calendar.YEAR) - admissao.get(Calendar.YEAR); // faz a diferenca dos anos e retorna
    }

}
