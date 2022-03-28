package trab.poo1_trab_banco;

import java.time.ZonedDateTime;
import java.util.LinkedList;
import java.util.Random;

public abstract class Conta {
    protected int numIdentificacao;
    protected ZonedDateTime dtCriacao;
    protected double saldo;
    protected ZonedDateTime ultimoAcesso;
    protected LinkedList<Cupom> cupons;

    private Random aux = new Random();

    public Conta(double saldo) {
        this.dtCriacao = ZonedDateTime.now();
        this.saldo = saldo;
        this.numIdentificacao = aux.nextInt(10000);
        this.ultimoAcesso = ZonedDateTime.now();
        this.cupons = new LinkedList<>();
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

    public void sacar(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
            this.ultimoAcesso = ZonedDateTime.now();
            if (valor > 5000) {
                cupons.add(new Cupom());
            }
        }
    }

    public void depositar(double valor) {
        this.saldo += valor;
        this.ultimoAcesso = ZonedDateTime.now();
        if (valor > 5000) {
            cupons.add(new Cupom());
        }
    }
}
