public class ContaCorrente extends Conta {

    public ContaCorrente(double saldo, double limite) {
        super(saldo, limite);
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito realizado na Conta Corrente: R$ " + valor);
    }

    @Override
    public void sacar(double valor) {
        if (saldo + limite >= valor) {
            saldo -= valor;
            System.out.println("Saque realizado na Conta Corrente: R$ " + valor);
        } else {
            System.out.println("Saldo insuficiente na Conta Corrente.");
        }
    }
}
