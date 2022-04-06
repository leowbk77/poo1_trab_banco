package trab.poo1_trab_banco.models;

import java.time.ZonedDateTime;
import java.util.LinkedList;
import java.util.UUID;

public abstract class Conta {
    protected UUID numIdentificacao;
    protected ZonedDateTime dtCriacao;
    protected double saldo;
    protected ZonedDateTime ultimoAcesso;
    protected LinkedList<Cupom> cupons;
    protected LinkedList<OpBancaria> operacoes;

    public Conta(double saldo) {
        this.dtCriacao = ZonedDateTime.now();
        this.saldo = saldo;
        this.numIdentificacao = UUID.randomUUID();
        this.ultimoAcesso = ZonedDateTime.now();
        this.cupons = new LinkedList<>();
        this.operacoes = new LinkedList<>();
    }

    public String getID(){
        return numIdentificacao.toString();
    }

    public ZonedDateTime getDtCriacao() {
        return dtCriacao;
    }

    public void setDtCriacao(ZonedDateTime dtCriacao) {
        this.dtCriacao = dtCriacao;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ZonedDateTime getUltimoAcesso() {
        return ultimoAcesso;
    }

    public void setUltimoAcesso(ZonedDateTime ultimoAcesso) {
        this.ultimoAcesso = ultimoAcesso;
    }

    public LinkedList<Cupom> getCupons() {
        return this.cupons;
    }

    public void sacar(double valor, String tipo, String descricao) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
            operacoes.add(new OpBancaria(tipo, descricao, valor, numIdentificacao));
            this.ultimoAcesso = ZonedDateTime.now();
            if (valor > 5000) {
                cupons.add(new Cupom());
            }
        }
    }

    public void depositar(double valor, String tipo, String descricao) {
        this.saldo += valor;
        operacoes.add(new OpBancaria(tipo, descricao, valor, numIdentificacao));
        this.ultimoAcesso = ZonedDateTime.now();
        if (valor > 5000) {
            cupons.add(new Cupom());
        }
    }

    public void imprimeConta() {
        System.out.printf("\nNum identificação conta: %s\n", this.numIdentificacao);
        System.out.printf("Saldo: %.2f\n", this.saldo);
    }
}
