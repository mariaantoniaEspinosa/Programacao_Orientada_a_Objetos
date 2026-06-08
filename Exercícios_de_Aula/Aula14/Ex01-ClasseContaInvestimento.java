public class ContaInvestimento extends Conta {

    public ContaInvestimento(double saldo, double limite) {
        super(saldo, limite);
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Valor investido: R$ " + valor);
    }

    @Override
    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Resgate realizado: R$ " + valor);
        } else {
            System.out.println("Saldo insuficiente para resgate.");
        }
    }
}
