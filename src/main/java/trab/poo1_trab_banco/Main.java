package trab.poo1_trab_banco;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import trab.poo1_trab_banco.models.*;

import java.io.IOException;
import java.time.ZonedDateTime;
import java.util.ArrayList;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("homepage.fxml"));

        Scene cena = new Scene(fxmlLoader.load(), 800, 600);

        Banco banco = new Banco(); // cria o banco na memoria
        HomepageControl controladorPrincipal = fxmlLoader.getController();
        controladorPrincipal.setBanco(banco); // passa para a interface a referencia do banco para acesso aos dados

        stage.setTitle("22Bank");
        stage.setScene(cena);

        stage.show();
    }

    public static void main(String[] args) {

<<<<<<< HEAD
//        ArrayList<Agencia> agencias = new ArrayList<>();
//        ArrayList<Cliente> clientes = new ArrayList<>();
//        ArrayList<Funcionario> funcionarios = new ArrayList<>();
//        ArrayList<Gerente> gerentes = new ArrayList<>();
//
//        // Criando agências localmente
//        Agencia agencia1 = new Agencia("Agência A", new Endereco("Uberlândia", "MG"));
//        Agencia agencia2 = new Agencia("Agência B", new Endereco("São Paulo", "SP"));
//        Agencia agencia3 = new Agencia("Agência C", new Endereco("Rio de Janeiro", "RJ"));
//        agencias.add(agencia1);
//        agencias.add(agencia2);
//        agencias.add(agencia3);
//
//        // Criando clientes localmente
//        Cliente cliente1 = new Cliente("Lucas", "123.456.789-00", ZonedDateTime.now(), "Bebedouro", "SP", "Rua São João 412");
//        Cliente cliente2 = new Cliente("Leonardo", "234.567.890-10", ZonedDateTime.now(), "Uberlândia", "MG", "Avenida João Naves 525");
//        Cliente cliente3 = new Cliente("Rafael", "345.678.910-20", ZonedDateTime.now(), "São Paulo", "SP", "Rua Palestra Itália 819");
//
//        cliente1.criarContaCorrente(1500, 12.5);
//        cliente2.criarContaPoupanca(5211, 7.5);
//
//        clientes.add(cliente1);
//        clientes.add(cliente2);
//        clientes.add(cliente3);
//
//        // Criando funcionários localmente
//        Funcionario funcionario1 = new Funcionario("João Pedro", "987.541.321-12", "(11) 99151-4231", ZonedDateTime.now(), 1, agencia1);
//        Funcionario funcionario2 = new Funcionario("Gisele", "514.997.123-44", "(34) 99812-5411", ZonedDateTime.now(), 3, agencia2);
//        funcionarios.add(funcionario1);
//        funcionarios.add(funcionario2);
//
//        // Criando gerentes localmente
//        Gerente gerente1 = new Gerente("Camila", "522.912.544-12", "(34) 99778-1251", ZonedDateTime.now(), 10, agencia1);
//        gerentes.add(gerente1);
//
//        for(Cliente cliente : clientes) {
//            System.out.printf("\nCliente %d:\n", clientes.indexOf(cliente) + 1);
//            cliente.imprimePessoa();
//        };
//
//        for(Funcionario funcionario: funcionarios) {
//            System.out.printf("\nFuncionário %d:\n", funcionarios.indexOf(funcionario) + 1);
//            funcionario.imprimePessoa();
//        }
//
//        cliente1.criarContaCorrente(1500, 15);
//        cliente1.getContas().get(0).imprimeConta();
//
//        cliente1.criarContaPoupanca(750, 5);
//        cliente1.getContas().get(1).imprimeConta();
=======
        ArrayList<Agencia> agencias = new ArrayList<>();
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        ArrayList<Gerente> gerentes = new ArrayList<>();

        // Criando agências localmente
        Agencia agencia1 = new Agencia("Agência A", new Endereco("Uberlândia", "MG"));
        Agencia agencia2 = new Agencia("Agência B", new Endereco("São Paulo", "SP", "Avenida Paulista 419"));
        Agencia agencia3 = new Agencia("Agência C", new Endereco("Rio de Janeiro", "RJ"));
        agencias.add(agencia1);
        agencias.add(agencia2);
        agencias.add(agencia3);

        // Criando clientes localmente
        Cliente cliente1 = new Cliente("Lucas", "123.456.789-00", ZonedDateTime.now(), "Bebedouro", "SP", "Rua São João 412");
        Cliente cliente2 = new Cliente("Leonardo", "234.567.890-10", ZonedDateTime.now(), "Uberlândia", "MG", "Avenida João Naves 525");
        Cliente cliente3 = new Cliente("Rafael", "345.678.910-20", ZonedDateTime.now(), "São Paulo", "SP", "Rua Palestra Itália 819");

        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);

        // Criando funcionários localmente
        Funcionario funcionario1 = new Funcionario("João Pedro", "987.541.321-12", "(11) 99151-4231", ZonedDateTime.now(), 1, agencia1);
        Funcionario funcionario2 = new Funcionario("Gisele", "514.997.123-44", "(34) 99812-5411", ZonedDateTime.now(), 3, agencia2);
        funcionarios.add(funcionario1);
        funcionarios.add(funcionario2);

        // Criando gerentes localmente
        Gerente gerente1 = new Gerente("Camila", "522.912.544-12", "(34) 99778-1251", ZonedDateTime.now(), 10, agencia1);
        gerentes.add(gerente1);

        for(Cliente cliente : clientes) {
            System.out.printf("\nCliente %d:\n", clientes.indexOf(cliente) + 1);
            cliente.imprimePessoa();
        };

        for(Funcionario funcionario: funcionarios) {
            System.out.printf("\nFuncionário %d:\n", funcionarios.indexOf(funcionario) + 1);
            funcionario.imprimePessoa();
        }

        cliente1.criarContaCorrente(1500, 15);
        cliente1.criarContaPoupanca(750, 5);

        for(Conta conta: cliente1.getContas()) {
            conta.imprimeConta();
        }

        for(Gerente gerente: gerentes) {
            System.out.printf("\nGerente %d:\n", gerentes.indexOf(gerente) + 1);
            gerente.imprimePessoa();
        }

        for(Agencia agencia: agencias) {
            System.out.printf("\nAgência %d:\n", agencias.indexOf(agencia) + 1);
            agencia.imprimeAgencia();
        }
>>>>>>> e83392f1b9015a0a920e3ba01964934350096af8

        // comentar a linha do launch para impedir de rodar a UI
        launch();
    }
}
