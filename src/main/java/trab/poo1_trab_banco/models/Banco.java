package trab.poo1_trab_banco.models;

import java.io.*;
import java.util.LinkedList;

public class Banco implements Serializable {
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

    // escreve as agencias em arquivo
    public void writeAgenciasToFile(){
        try{
            FileOutputStream fos = new FileOutputStream("agenciasData.tmp");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(agencias);
            oos.close();
            System.out.println("Salvo!");
        }catch(IOException e){
            System.out.println("EXCEPTION - " + e.getMessage());
        }
    }
    // le agencias em arquivo
    public void readAgenciasFromFile(){
        try{
            FileInputStream fis = new FileInputStream("agenciasData.tmp");
            ObjectInputStream ois = new ObjectInputStream(fis);
            try {
                LinkedList<Agencia> listaDoArquivo = (LinkedList<Agencia>) ois.readObject();
                agencias.addAll(listaDoArquivo);
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

    public int numeroDeClientes(){
        return clientes.size();
    }
    public int numeroDeFuncionarios() { return funcionarios.size(); }
    public int numeroDeAgencias(){return agencias.size();}
}
