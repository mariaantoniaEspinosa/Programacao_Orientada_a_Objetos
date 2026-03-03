package pkg;

import java.util.Scanner;

public class Exercício05 {

	public static void main(String[] args) {
		 //Escreva um programa Java que use um laço para calcular o fatorial de um número inteiro.
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int numero;
		int fatorial = 1;
		numero = teclado.nextInt();
		for(int i=1; i<=numero; i++) {
			fatorial*=i;
		}
		System.out.println("O fatorial de " + numero + " é " + fatorial);
	}

}
