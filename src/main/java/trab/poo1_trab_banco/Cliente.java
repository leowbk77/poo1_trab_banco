package trab.poo1_trab_banco;

import java.util.Calendar;

public class Cliente extends Pessoa{
    private int id;

    private Endereco enderecoCliente;
    private Gerente gerente;
    // private LinkedList<Conta> contas; ?

    public Cliente(String nome, String cpf, Calendar nascimento, String cidade, String estado, String endereco, int id){
        super(nome, cpf);
        super.nascimento = nascimento;
        enderecoCliente = new Endereco(cidade, estado, endereco);
        this.id = id;
        gerente = null;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setEndereco(Endereco enderecoCliente){
        this.enderecoCliente = enderecoCliente;
    }

    public void setGerente(Gerente gerente){
        this.gerente = gerente;
        // gerente.tempMethod(); ---->REMOVER
    }

}
