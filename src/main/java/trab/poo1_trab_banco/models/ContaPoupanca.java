package trab.poo1_trab_banco.models;

public class ContaPoupanca extends Conta{
    private double taxaJuros;

    public ContaPoupanca(double saldo, double taxaJuros) {
        super(saldo);
        this.taxaJuros = taxaJuros;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public void imprimeConta() {
        super.imprimeConta();
        System.out.printf("Taxa juros: %.2f%%\n", this.taxaJuros);
    }
}
