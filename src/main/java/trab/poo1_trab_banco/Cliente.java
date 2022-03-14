package trab.poo1_trab_banco;

import java.util.Calendar;

public class Cliente extends Pessoa{
    private int id;
    private Endereco enderecoCliente;
    // private Gerente gerente;

    public Cliente(String nome, String cpf, Calendar nascimento, String cidade, String estado, String endereco, int id){
        super.nome = nome;
        super.cpf = cpf;
        super.nascimento = nascimento;
        enderecoCliente = new Endereco(cidade, estado, endereco);
        this.id = id;
        // gerente = null;
    }


}
