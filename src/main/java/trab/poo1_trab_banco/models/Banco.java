package trab.poo1_trab_banco.models;

public class Banco {
    List<Agencia> agencias = new ArrayList<>();

    public Banco() {
    }

    public void adicionarAgencia(Agencia agencia){
        agencias.add(agencia);
    }

    public void removerAgencia(Agencia agencia){
        agencias.remove(agencia);
    }
}
