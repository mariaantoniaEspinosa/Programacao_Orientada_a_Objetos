package pkg;

import java.util.Scanner;

public class PrincipalContaBancaria {

	public static void main(String[] args) {
		ContaBancaria c = new ContaBancaria(100, 50);
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Saldo inicial: " + c.getSaldo());
		System.out.println("Limite da conta: " + c.getLimite());
		
		double valor;
		
		System.out.println("Quanto deseja sacar(R$)? ");
		valor = teclado.nextDouble();
		
		c.saque(valor);
	
	}

}
