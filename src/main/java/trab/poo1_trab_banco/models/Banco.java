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
}
