package trab.poo1_trab_banco;

import java.time.ZonedDateTime;
import java.util.Random;

public class Cupom {
    public int numCupom;
    public ZonedDateTime validade;

    private Random aux = new Random();

    public Cupom(){
        this.numCupom = aux.nextInt(10000);
        this.validade = ZonedDateTime.now();
    }

    public int getNumCupom() {
        return numCupom;
    }

    public ZonedDateTime getValidade() {
        return validade;
    }
}
