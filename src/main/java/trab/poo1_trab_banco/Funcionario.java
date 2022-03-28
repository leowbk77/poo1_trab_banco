package trab.poo1_trab_banco;

import java.time.ZonedDateTime;
import java.util.LinkedList;
import java.util.Random;

public class Funcionario extends Pessoa{
    protected int numFuncional;
    protected String fone;

    protected LinkedList<String> dependentes;
    protected Funcionario supervisor;
    protected int tempoServico;
    protected ZonedDateTime admissao;

    private Random aux = new Random();

    public Funcionario(String nome, String cpf, String fone, ZonedDateTime admissao, int tempoServico){
        super(nome, cpf);
        this.numFuncional = aux.nextInt(10000);
        this.fone = fone;
        this.tempoServico = tempoServico;
        this.admissao = admissao;
        this.supervisor = null;
        this.dependentes = new LinkedList<String>();
    }

    public void setSupervisor(Funcionario supervisor){
        this.supervisor = supervisor;
    }

//    public int getTempoServico(){
//        /* TEMPORARIO //
//        // (alterar)  */
//        Calendar temp = Calendar.getInstance(); // pega o tempo atual
//        return temp.get(Calendar.YEAR) - admissao.get(Calendar.YEAR); // faz a diferenca dos anos e retorna
//    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public LinkedList<String> getDependentes() {
        return dependentes;
    }

    public void setDependentes(LinkedList<String> dependentes) {
        this.dependentes = dependentes;
    }

    public Funcionario getSupervisor() {
        return supervisor;
    }

    public int getTempoServico() {
        return tempoServico;
    }

    public void setTempoServico(int tempoServico) {
        this.tempoServico = tempoServico;
    }

    public ZonedDateTime getAdmissao() {
        return admissao;
    }

    public void setAdmissao(ZonedDateTime admissao) {
        this.admissao = admissao;
    }
}
