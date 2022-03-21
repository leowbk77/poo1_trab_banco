package trab.poo1_trab_banco;

import java.time.ZonedDateTime;
import java.util.Random;

public abstract class Conta {
    protected int numIdentificacao;
    protected ZonedDateTime dtCriacao;
    protected double saldo;
    protected ZonedDateTime ultimoAcesso;

    private Random aux = new Random();

    public Conta(double saldo) {
        this.dtCriacao = ZonedDateTime.now();
        this.saldo = saldo;
        this.numIdentificacao = aux.nextInt(10000);
        this.ultimoAcesso = ZonedDateTime.now();
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
}
