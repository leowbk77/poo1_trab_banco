package trab.poo1_trab_banco;

import java.time.ZonedDateTime;

public class OpBancaria {
    private String tipo;
    private String descricao;
    private double valor;
    private int idContaCorrente;

    private ZonedDateTime data;

    public OpBancaria(String tipo, String descricao, double valor, int idContaCorrente) {
        this.tipo = tipo;
        this.descricao = descricao;
        this.valor = valor;
        this.idContaCorrente = idContaCorrente;
        this.data = ZonedDateTime.now();
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getIdContaCorrente() {
        return idContaCorrente;
    }

    public ZonedDateTime getData() {
        return data;
    }
}
