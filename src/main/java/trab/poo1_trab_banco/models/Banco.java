package trab.poo1_trab_banco.models;

import java.util.LinkedList;

public class Banco {
    LinkedList<Agencia> agencias;
    LinkedList<Pessoa> pessoas;


    public Banco() {
        agencias = new LinkedList<>();
        pessoas = new LinkedList<>();
    }

    public void adicionarAgencia(Agencia agencia){
        agencias.add(agencia);
    }

    public void removerAgencia(Agencia agencia){
        agencias.remove(agencia);
    }

    public void adicionarCliente(Pessoa pessoa){
        if(pessoa instanceof Cliente)
        pessoas.add(pessoa);
    }

    public void removerCliente(Pessoa pessoa){
        if(pessoa instanceof Cliente)
        pessoas.remove(pessoa);
    }
}
