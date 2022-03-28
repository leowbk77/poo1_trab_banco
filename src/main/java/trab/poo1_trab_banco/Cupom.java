package trab.poo1_trab_banco;

import java.time.ZonedDateTime;

public class Cupom {
    public int numCupom;
    public ZonedDateTime validade;

    public Cupom(int numCupom, ZonedDateTime validade){
        this.numCupom = numCupom;
        this.validade = validade;
    }
}
