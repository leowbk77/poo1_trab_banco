package trab.poo1_trab_banco;

import java.util.Calendar;

public abstract class Pessoa {
    protected String nome;
    protected String cpf;
    protected Calendar nascimento;

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

    public void setNascimento(Calendar nascimento) {
        this.nascimento = nascimento;
    }
}
