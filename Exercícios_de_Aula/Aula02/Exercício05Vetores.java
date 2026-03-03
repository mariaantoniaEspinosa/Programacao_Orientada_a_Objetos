package pkg;

import java.util.Scanner;

public class Exercício05Vetores {

	public static void main(String[] args) {
		//  Escreva um programa Java que use um vetor para ler 10 números inteiros lidos do usuário e depois imprima o maior e o menor valor.
		Scanner teclado = new Scanner(System.in);
		int[] vetor = new int[10];
		
		System.out.println("Digite 10 numeros inteiros: ");
		for(int i = 0; i<vetor.length; i++) {
			System.out.print("Numero " + (i+1) + ":");
			vetor[i] = teclado.nextInt();
		}
		
	
		int maior = vetor[0];
		int menor = vetor[0];
		
		for(int i = 1; i<vetor.length;i++) {
			if(vetor[i]>maior) {
				maior = vetor[i];
			}
			if(vetor[i]<menor) {
				menor = vetor[i];
			}
		}
		System.out.println("O maior numero é " + maior);
		System.out.println("O menor numero é " + menor);
		
		teclado.close();

	}

}
