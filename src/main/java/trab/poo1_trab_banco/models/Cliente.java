package trab.poo1_trab_banco.models;

//import java.time.ZonedDateTime;
import java.util.List;
import java.util.Date;
import java.util.LinkedList;
import java.util.UUID;

public class Cliente extends Pessoa{
    private UUID id;
    private Endereco enderecoCliente;
    private Gerente gerente;
    private List<Conta> contas;

    public Cliente(String nome, String cpf, Date nascimento, String cidade, String estado, String endereco){
        super(nome, cpf);
        super.nascimento = nascimento;
        enderecoCliente = new Endereco(cidade, estado, endereco);

        this.id = UUID.randomUUID();

        gerente = null;
        contas = new LinkedList<Conta>();
    }

    public Endereco getEnderecoCliente() {
        return enderecoCliente;
    }

    public void setEnderecoCliente(Endereco enderecoCliente) {
        this.enderecoCliente = enderecoCliente;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void criarContaPoupanca(double saldo, double taxaJuros) {
        contas.add(new ContaPoupanca(saldo, taxaJuros));
    }

    public void criarContaCorrente(double saldo, double tarifaMensal) {
        contas.add(new ContaCorrente(saldo, tarifaMensal));
    }
}
