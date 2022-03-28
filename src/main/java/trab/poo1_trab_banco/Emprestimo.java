package trab.poo1_trab_banco;

import java.util.Random;

public class Emprestimo {
    private int numEmprestimo;
    private double valor;
    private int numParcelas;
    private Agencia agenciaOrigem;

    private Random aux = new Random();

    public Emprestimo(double valor, int numParcelas, Agencia agenciaOrigem){
        this.numEmprestimo = aux.nextInt(10000);
        this.agenciaOrigem = agenciaOrigem;
        this.numParcelas = numParcelas;
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getNumParcelas() {
        return numParcelas;
    }

    public void setNumParcelas(int numParcelas) {
        this.numParcelas = numParcelas;
    }

    public int getNumEmprestimo() {
        return numEmprestimo;
    }

    public Agencia getAgenciaOrigem() {
        return agenciaOrigem;
    }
}
