package pkg;

import java.util.Scanner;

public class Exercício07 {

	public static void main(String[] args) {
		
		float valor1;
		float valor2;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		valor1 = teclado.nextFloat();
		
		System.out.println("Digite o segundo valor: ");
		valor2 = teclado.nextFloat();
		
		if(valor1 % valor2 == 0) {
			System.out.println("O valor 1 é multiplo do valor 2");
		}else if(valor2 % valor1 == 0) {
			System.out.println("O valor 2 é multiplo do valor 1");
		}else {
			System.out.println("Não são multiplos");
		}
	
	}

}
