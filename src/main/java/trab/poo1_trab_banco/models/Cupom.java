package trab.poo1_trab_banco.models;

import java.time.ZonedDateTime;
import java.util.UUID;

public class Cupom {
    public UUID numCupom;
    public ZonedDateTime validade;

    public Cupom(){
        this.numCupom = UUID.randomUUID();
        this.validade = ZonedDateTime.now();
    }

    public UUID getNumCupom() {
        return numCupom;
    }

    public ZonedDateTime getValidade() {
        return validade;
    }
}
