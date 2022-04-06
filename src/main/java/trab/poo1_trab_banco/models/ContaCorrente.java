package trab.poo1_trab_banco.models;

public class ContaCorrente extends Conta{
    private double tarifaMensal;

    public ContaCorrente(double saldo, double tarifaMensal) {
        super(saldo);
        this.tarifaMensal = tarifaMensal;
    }

    public double getTarifaMensal() {
        return tarifaMensal;
    }

    public void setTarifaMensal(double tarifaMensal) {
        this.tarifaMensal = tarifaMensal;
    }

    public void imprimeConta() {
        super.imprimeConta();
        System.out.printf("Tarifa mensal: %.2f%%\n", this.tarifaMensal);
    }
}
