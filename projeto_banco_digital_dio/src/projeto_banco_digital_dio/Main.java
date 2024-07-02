package projeto_banco_digital_dio;

public class Main {
    public static void main(String[] args) {

        Conta ccLuciana = new ContaCorrente(new Cliente("luciana"));
        Conta cpLuciana = new ContaPoupanca(new Cliente("luciana"));
        Conta cpAlice = new ContaPoupanca(new Cliente("alice"));
        Conta ccNoah = new ContaCorrente(new Cliente("noah"));
        Conta cpNoah = new ContaCorrente(new Cliente("noah"));
        Conta ccMaria = new ContaCorrente(new Cliente("maria"));


        ccLuciana.depositar(100.55);
        ccLuciana.transferir(50.42, cpAlice);

        ccLuciana.imprimirExtrato();
        cpAlice.imprimirExtrato();

        //Lista de clientes do banco
        System.out.println(Banco.getClientes());

    }
}