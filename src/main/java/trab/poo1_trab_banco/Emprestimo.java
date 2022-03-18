package trab.poo1_trab_banco;

public class Emprestimo {
    private int numEmprestimo;
    private double valor;
    private int numParcelas;

    private Agencia agenciaOrigem;
    //private LinkedList<Cliente> clientes;

    public Emprestimo(int numEmprestimo, double valor, int numParcelas, Agencia agenciaOrigem){
        this.numEmprestimo = numEmprestimo;
        this.agenciaOrigem = agenciaOrigem;
        this.numParcelas = numParcelas;
        this.valor = valor;
    }

}
