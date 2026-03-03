package pkg;

import java.util.Scanner;

public class Exercício07 {

	public static void main(String[] args) {
		// Escreva um programa Java que use um laço para ler a nota de vários alunos até que seja lida a nota -1.
		
		Scanner teclado = new Scanner(System.in);
		int notas;
		do {
			
		System.out.println("Digite a nota do estudante: ");
		notas = teclado.nextInt();
		
		}while(notas!= -1); 

	}

}
