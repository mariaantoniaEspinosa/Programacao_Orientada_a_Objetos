package pkg;

import java.util.Scanner;

public class Questão03Vetores {

	public static void main(String[] args) {
		//  Escreva um programa Java que use um vetor para ler as notas de 5 alunos e depois calcule e imprima a média das notas.
		
		Scanner teclado = new Scanner (System.in);
		
		int []vetor = new int[5];
		double media;
		double soma=0;
		
		for(int i = 0; i<5; i++) {
			System.out.println("Digite a nota do aluno " + i + ":" );
			vetor[i] = teclado.nextInt();
		}
		
		for(int i = 0; i<vetor.length; i++) {
			soma+= vetor[i]/i;
		}
		media = soma /vetor.length;
		System.out.println("A média é: " +media);
		
		teclado.close();

	}

}
