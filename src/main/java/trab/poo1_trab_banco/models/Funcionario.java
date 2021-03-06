package trab.poo1_trab_banco.models;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.UUID;

public class Funcionario extends Pessoa implements Serializable {
    protected UUID numFuncional;
    protected String fone;
    protected LinkedList<String> dependentes;
    protected Funcionario supervisor;
    protected int tempoServico;
    protected LocalDate admissao;
    protected Agencia agencia;

    public Funcionario(String nome, String cpf, String fone, LocalDate admissao, int tempoServico, Agencia agencia){
        super(nome, cpf);
        this.numFuncional = UUID.randomUUID();
        this.fone = fone;
        this.tempoServico = tempoServico;
        this.admissao = admissao;
        this.supervisor = null;
        this.dependentes = new LinkedList<String>();
        this.agencia = agencia;
    }

    public void setSupervisor(Funcionario supervisor){
        this.supervisor = supervisor;
    }

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
        return LocalDate.now().getYear() - this.admissao.getYear();
    }

    public void setTempoServico(int tempoServico) {
        this.tempoServico = tempoServico;
    }

    public LocalDate getAdmissao() {
        return admissao;
    }

    public void setAdmissao(LocalDate admissao) {
        this.admissao = admissao;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public void imprimePessoa() {
        super.imprimePessoa();
        System.out.printf("Telefone: %s\n", this.fone);
    };
}
