public class Main {
    public static void main(String[] args) {


        Cliente clienteFisico = new Cliente();
        clienteFisico.setTipoCliente("PF");
        clienteFisico.setNome("Jhon");

        Cliente clienteJuridico = new Cliente();
        clienteJuridico.setTipoCliente("PJ");
        clienteJuridico.setNome("Fake Name Bussines");


        Conta cc = new ContaCorrente(clienteJuridico);
        Conta cp = new ContaPoupanca(clienteFisico);

        cc.depositar(10);
        cc.transferir(5, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }

}