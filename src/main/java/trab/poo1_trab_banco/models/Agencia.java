package trab.poo1_trab_banco.models;

import java.io.Serializable;

public class Agencia implements Serializable {
    private String nome;
    private Endereco endereco;

    public Agencia(String nome, Endereco endereco){
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void imprimeAgencia() {
        System.out.printf("Nome da agência: %s\n", this.nome);
        System.out.printf("Cidade: %s - Estado: %s\n", this.endereco.getCidade(), this.endereco.getEstado());
        System.out.printf("Endereço: %s\n", this.endereco.getEndereco());
    }
}
