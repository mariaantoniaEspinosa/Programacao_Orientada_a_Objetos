package pkg;

import java.util.Scanner;

public class Exercício08Vetores {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int []numeros = new int [10];
		
		int pares = 0;
		int impares = 0;
		
		for(int i = 0; i<10; i++) {
			System.out.println("Digite um numero: ");
			numeros[i] = teclado.nextInt();
		}
		
		for(int i = 0; i<10; i++) {
			if(numeros[i]%2 == 0) {
				pares++;
			}else {
				impares++;
			}
		}
		
		System.out.println("Total de numeros pares: " + pares);
		System.out.println("Total de numeros impares: " + impares);
		
		teclado.close();

	}

}
