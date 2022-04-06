package trab.poo1_trab_banco.models;

import java.util.LinkedList;

public class Banco {
    // listas
    private LinkedList<Agencia> agencias;
    private LinkedList<Cliente> clientes;
    private LinkedList<Funcionario> funcionarios;

    // metodos
    public Banco(){
        agencias = new LinkedList<Agencia>();
        clientes = new LinkedList<Cliente>();
        funcionarios = new LinkedList<Funcionario>();
    }

    // adicao de novos membros
    public void add_agencia(Agencia novaAgencia){
        agencias.add(novaAgencia);
    }
    public void add_cliente(Cliente novoCliente){
        clientes.add(novoCliente);
    }
    public void add_funcionario(Funcionario novoFuncionario){
        funcionarios.add(novoFuncionario);
    }

    // remocao de membros?

    // temp (talvez nao seja necessario)
    public LinkedList<Agencia> getAgencias(){
        return agencias;
    }
    public LinkedList<Cliente> getClientes(){
        return clientes;
    }
    public LinkedList<Funcionario> getFuncionarios(){
        return funcionarios;
    }

    public int numeroDeClientes(){
        return clientes.size();
    }
}
