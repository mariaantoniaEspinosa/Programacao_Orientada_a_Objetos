package pkg;

import java.util.Scanner;

public class Exercício05 {
	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int valor1, valor2, valor3;
		
		System.out.println("Digite um valor: ");
		valor1 = teclado.nextInt();
		
		System.out.println("Digite outro valor: ");
		valor2 = teclado.nextInt();
		
		System.out.println("Digite outro valor: ");
		valor3 = teclado.nextInt();
		
		if(valor1> valor2 && valor1> valor2) {
			System.out.println("O valor " + valor1 + " é o maior");
		} 
		else if(valor2>valor1 && valor2>valor3) {
			System.out.println("O valor " + valor2 + " é o maior");
		}
		else if(valor3>valor1 && valor3>valor2) {
			System.out.println("O valor " + valor3 + " é o maior");
		}
		
		
	}
}
