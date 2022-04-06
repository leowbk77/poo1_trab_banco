package trab.poo1_trab_banco.models;

import java.io.*;
import java.util.LinkedList;

public class Banco implements Serializable {
    // listas
    private LinkedList<Agencia> agencias;
    private LinkedList<Cliente> clientes;
    private LinkedList<Funcionario> funcionarios;
    private LinkedList<Conta> contas;

    // metodos
    public Banco(){
        agencias = new LinkedList<Agencia>();
        clientes = new LinkedList<Cliente>();
        funcionarios = new LinkedList<Funcionario>();
        contas = new LinkedList<Conta>();
    }


    // escreve clientes em arquivo
    public void writeClientesToFile(){
        try{
            FileOutputStream fos = new FileOutputStream("clientesData.tmp");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(clientes);
            oos.close();
            System.out.println("Salvo!");
        } catch (IOException e){
            System.out.println("EXCEPTION - " + e.getMessage());
        }
    }
    // le clientes em arquivo
    public void readClientesFromFile(){
        try{
            FileInputStream fis = new FileInputStream("clientesData.tmp");
            ObjectInputStream ois = new ObjectInputStream(fis);
            try{
                LinkedList<Cliente> listaDoArquivo = (LinkedList<Cliente>) ois.readObject();
                clientes.addAll(listaDoArquivo);
                System.out.println("Carregado!");
            } catch(ClassNotFoundException e){
                System.out.println("EXCEPTION - " + e.getMessage());
            }
        }catch(IOException e){
            System.out.println("EXCEPTION - " + e.getMessage());
        }
    }

    // escreve funcionarios em arquivo
    public void writeFuncionariosToFile(){
        try{
            FileOutputStream fos = new FileOutputStream("funcionariosData.tmp");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(funcionarios);
            oos.close();
            System.out.println("Salvo!");
        } catch (IOException e){
            System.out.println("EXCEPTION - " + e.getMessage());
        }
    }
    // le funcionarios em arquivo
    public void readFuncionariosFromFile(){
        try{
            FileInputStream fis = new FileInputStream("funcionariosData.tmp");
            ObjectInputStream ois = new ObjectInputStream(fis);
            try{
                LinkedList<Funcionario> listaDoArquivo = (LinkedList<Funcionario>) ois.readObject();
                funcionarios.addAll(listaDoArquivo);
                System.out.println("Carregado!");
            }catch (ClassNotFoundException e){
                System.out.println("EXCEPTION - " + e.getMessage());
            }
        }catch (IOException e){
            System.out.println("EXCEPTION - " + e.getMessage());
        }
    }

    // escreve as contas em arquivo
    public void writeContasToFile(){
        try{
            FileOutputStream fos = new FileOutputStream("contasData.tmp");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(contas);
            oos.close();
            System.out.println("Salvo!");
        }catch(IOException e){
            System.out.println("EXCEPTION - " + e.getMessage());
        }
    }
    // le contas em arquivo
    public void readContasFromFile(){
        try{
            FileInputStream fis = new FileInputStream("contasData.tmp");
            ObjectInputStream ois = new ObjectInputStream(fis);
            try {
                LinkedList<Conta> listaDoArquivo = (LinkedList<Conta>) ois.readObject();
                contas.addAll(listaDoArquivo);
                System.out.println("Carregado!");
            }catch (ClassNotFoundException e){
                System.out.println("EXCEPTION - " + e.getMessage());
            }
        }catch (IOException e){
            System.out.println("EXCEPTION - " + e.getMessage());
        }
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
    public void add_conta(Conta novaConta) { contas.add(novaConta); }
    // remocao de membros? (futuro - sem tempo)


    public LinkedList<Agencia> getAgencias(){
        return agencias;
    }
    public LinkedList<Cliente> getClientes(){
        return clientes;
    }
    public LinkedList<Funcionario> getFuncionarios(){
        return funcionarios;
    }
    public LinkedList<Conta> getContas(){
        return contas;
    }

    public int numeroDeClientes(){
        return clientes.size();
    }
    public int numeroDeFuncionarios() { return funcionarios.size(); }
    public int numeroDeAgencias(){return agencias.size();}
    public int numeroDeContas(){ return contas.size(); }
}
