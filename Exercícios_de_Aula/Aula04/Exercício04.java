package pkg;

public class PrincipalConta {

	public static void main(String[] args) {
		ContaCorrente novaConta = new ContaCorrente();
		
		novaConta.definirSaldoInicial(1000);
		System.out.println("Saldo inicial: "+ novaConta.saldo + " reais");
		
		if(novaConta.sacar(500)) {
			System.out.println("Saque de 500 reais realizado");
		} else {
			System.out.println("Saldo insuficiente");
		}
		
		novaConta.depositar(50);
		System.out.println("Novo saldo: " + novaConta.saldo + " reais");
		
		if(novaConta.sacar(600)) {
			System.out.println("Saque de 600 reais realizado");
		} else {
			System.out.println("Saldo insuficiente");
		}
		
		System.out.println("Saldo final: " + novaConta.saldo + " reais");

	}

}
