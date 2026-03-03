package pkg;

import java.util.Scanner;

public class Exercício06Vetores {

	public static void main(String[] args) {
		// Exercício 6
		Scanner teclado = new Scanner(System.in);
		
		String [] cidades = new String[5];
		int [] populacao = new int[5];
		
		for(int i = 0; i<5; i++) {
			System.out.println("Digite o nome da cidade: ");
			cidades[i] = teclado.nextLine();
			
			System.out.println("Digite a populaçao da cidade: ");
			populacao[i] = teclado.nextInt();
			
			teclado.nextLine();
		}
		int maior = populacao[0];
		int indice = 0;
		
		for(int i = 1; i<5; i++) {
			if(populacao[i]>maior) {
				maior = populacao[i];
				indice = i;
			}
		}
		
		System.out.println("A cidade com maior populaçao é " + cidades[indice]);

	}

}
