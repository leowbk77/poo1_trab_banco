package trab.poo1_trab_banco.models;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.LinkedList;
import java.util.UUID;

public abstract class Conta implements Serializable {
    protected UUID numIdentificacao;
    protected LocalDate dtCriacao;
    protected double saldo;
    protected LocalDate ultimoAcesso;
    protected LinkedList<Cupom> cupons;
    protected LinkedList<OpBancaria> operacoes;

    public Conta(double saldo) {
        this.dtCriacao = LocalDate.now();
        this.saldo = saldo;
        this.numIdentificacao = UUID.randomUUID();
        this.ultimoAcesso = LocalDate.now();
        this.cupons = new LinkedList<>();
        this.operacoes = new LinkedList<>();
    }

    public String getID(){
        return numIdentificacao.toString();
    }

    public LocalDate getDtCriacao() {
        return dtCriacao;
    }

    public void setDtCriacao(LocalDate dtCriacao) {
        this.dtCriacao = dtCriacao;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public LocalDate getUltimoAcesso() {
        return ultimoAcesso;
    }

    public void setUltimoAcesso(LocalDate ultimoAcesso) {
        this.ultimoAcesso = ultimoAcesso;
    }

    public LinkedList<Cupom> getCupons() {
        return this.cupons;
    }

    public void sacar(double valor, String tipo, String descricao) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
            operacoes.add(new OpBancaria(tipo, descricao, valor, numIdentificacao));
            this.ultimoAcesso = LocalDate.now();
            if (valor > 5000) {
                cupons.add(new Cupom());
            }
        }
    }

    public void depositar(double valor, String tipo, String descricao) {
        this.saldo += valor;
        operacoes.add(new OpBancaria(tipo, descricao, valor, numIdentificacao));
        this.ultimoAcesso = LocalDate.now();
        if (valor > 5000) {
            cupons.add(new Cupom());
        }
    }

    public void imprimeConta() {
        System.out.printf("\nNum identificação conta: %s\n", this.numIdentificacao);
        System.out.printf("Saldo: %.2f\n", this.saldo);
        if (!this.cupons.isEmpty()) {
            for (Cupom cupom : this.cupons) {
                System.out.printf("Cupom %d:\n", this.cupons.indexOf(cupom) + 1);
                System.out.printf("Número do cupom: %s\n", cupom.getNumCupom());
            }
        }
    }
}
