package trab.poo1_trab_banco;

import java.util.Calendar;
import java.util.LinkedList;
import java.util.Random;

public class Cliente extends Pessoa{
    private int id;

    private Endereco enderecoCliente;
    private Gerente gerente;
    private LinkedList<Conta> contas;

    Random aux = new Random();

    public Cliente(String nome, String cpf, Calendar nascimento, String cidade, String estado, String endereco){
        super(nome, cpf);
        super.nascimento = nascimento;
        enderecoCliente = new Endereco(cidade, estado, endereco);
        this.id = aux.nextInt(10000);
        gerente = null;
        contas = new LinkedList<Conta>();
    }

    public Endereco getEnderecoCliente() {
        return enderecoCliente;
    }

    public void setEnderecoCliente(Endereco enderecoCliente) {
        this.enderecoCliente = enderecoCliente;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public LinkedList<Conta> getContas() {
        return contas;
    }

    public void setContas(LinkedList<Conta> contas) {
        this.contas = contas;
    }
}
