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
}
