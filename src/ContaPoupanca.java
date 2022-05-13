public class ContaPoupanca extends Conta {

    public void imprimirExtrato() {
        System.out.println("*** Extrato de Conta Poupanca ***");
        super.imprimirInfosComuns();
    }


}
