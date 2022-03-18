package trab.poo1_trab_banco;

public class Agencia {
    public String nome;
    public Endereco endereco;

    Agencia(String nome, Endereco endereco){
        this.nome = nome;
        this.endereco = endereco;
    }

    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
}
