package trab.poo1_trab_banco;

import java.time.ZonedDateTime;

public abstract class Pessoa {
    protected String nome;
    protected String cpf;
    protected ZonedDateTime nascimento;

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

    public void setNascimento(ZonedDateTime nascimento) {
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public ZonedDateTime getNascimento() {
        return nascimento;
    }
}
