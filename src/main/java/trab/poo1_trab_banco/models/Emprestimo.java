package trab.poo1_trab_banco.models;

import java.util.UUID;

public class Emprestimo {
    private UUID numEmprestimo;
    private double valor;
    private int numParcelas;
    private Agencia agenciaOrigem;

    public Emprestimo(double valor, int numParcelas, Agencia agenciaOrigem){
        this.numEmprestimo = UUID.randomUUID();
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

    public UUID getNumEmprestimo() {
        return numEmprestimo;
    }

    public Agencia getAgenciaOrigem() {
        return agenciaOrigem;
    }
}
