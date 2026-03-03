package pkg;

import java.util.Scanner;

public class Exercício06 {

	public static void main(String[] args) {
		//  Escreva um programa Java que use um laço para ler uma sequência de números inteiros do usuário até que o número 0 seja lido.
		
		Scanner teclado = new Scanner(System.in);
		int numero;
	
		do {
			System.out.println("Digite um numero: ");
			numero = teclado.nextInt();
			
			
			if(numero!=0) {
				System.out.println("Seu ultimo numero digitado é :  " + numero );
			}
			
		}while(numero!=0);

	}

}
