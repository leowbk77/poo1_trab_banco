package trab.poo1_trab_banco;

import java.util.Calendar;

public class OpBancaria {
    private int numOp;
    private double valor;
    private String descricao;

    private Calendar data;
    // private Conta tipo; ?

    public OpBancaria(int numOp, double valor, String descricao, Calendar data){
        this.descricao = descricao;
        this.valor = valor;
        this.numOp = numOp;
        this.data = data;
    }


}
