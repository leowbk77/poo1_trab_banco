package trab.poo1_trab_banco.models;

import java.io.Serializable;
import java.time.LocalDate;

public abstract class Pessoa implements Serializable {
    protected String nome;
    protected String cpf;
    protected LocalDate nascimento;

    public Pessoa(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void imprimePessoa() {
        System.out.printf("Nome: %s\n", this.nome);
        System.out.printf("CPF: %s\n", this.cpf);
    };
}
