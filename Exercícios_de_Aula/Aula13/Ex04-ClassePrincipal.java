package pacote4;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ContaBancaria c = new ContaBancaria();
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("O valor do saldo inicial é: ");
		c.saldo = teclado.nextDouble();
		
		c.depositar(15);
		
		c.depositar(15, 10);
		
		System.out.println("O valor do saldo final é: "+ c.saldo);
	}	
}
