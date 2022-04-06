package trab.poo1_trab_banco.models;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;
//import java.util.LinkedList;
import java.util.UUID;

public class Funcionario extends Pessoa{
    protected UUID numFuncional;
    protected String fone;
    protected List<String> dependentes;
    protected Funcionario supervisor;
    protected int tempoServico;
    protected Date admissao;
    protected Agencia agencia;

    public Funcionario(String nome, String cpf, String fone, Date admissao, int tempoServico, Agencia agencia){
        super(nome, cpf);
        this.numFuncional = UUID.randomUUID();
        this.fone = fone;
        this.tempoServico = tempoServico;
        this.admissao = admissao;
        this.supervisor = null;
        this.dependentes = new ArrayList<>();
        this.agencia = agencia;
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
  
    public List<String> getDependentes() {
        return dependentes;
    }

    //Listas não podem ser alteradas

    /*public void setDependentes(LinkedList<String> dependentes) {
        this.dependentes = dependentes;
    }*/

    public Funcionario getSupervisor() {
        return supervisor;
    }

    public int getTempoServico() {
        return tempoServico;
    }

    public void setTempoServico(int tempoServico) {
        this.tempoServico = tempoServico;
    }

    public Date getAdmissao() {
        return admissao;
    }

    public void setAdmissao(Date admissao) {
        this.admissao = admissao;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public void adicionaDependente(String dependente){
        dependentes.add(dependente);
    }

    public void removeDependente(String dependente){
        dependentes.remove(dependente);
    }
}
