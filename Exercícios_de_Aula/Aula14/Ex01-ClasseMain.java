public class Main {

    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente(1000, 500);

        cc.depositar(300);
        cc.sacar(1200);

        System.out.println("Saldo Conta Corrente: R$ " + cc.getSaldo());

        System.out.println();

        ContaInvestimento ci = new ContaInvestimento(5000, 0);

        ci.depositar(1000);
        ci.sacar(2000);

        System.out.println("Saldo Conta Investimento: R$ " + ci.getSaldo());
    }
}
