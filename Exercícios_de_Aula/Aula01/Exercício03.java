package pkg;

import java.util.Scanner;

public class Excercício03 {

	public static void main(String[] args) {
		
		float valor1, valor2, valor3, valor4;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o valor 1: ");
		valor1 = teclado.nextFloat();
		
		System.out.println("Digite o valor 2: ");
		valor2 = teclado.nextFloat();
		
		System.out.println("Digite o valor 3: ");
		valor3 = teclado.nextFloat();
		
		System.out.println("Digite o valor 4: ");
		valor4 = teclado.nextFloat();
		
		float media;
		
		media = (valor1 + valor2 + valor3 + valor4) / 4;
		
		if(valor1>media) {
			System.out.println("Valor 1 é maior que a media");
		} else if (valor2>media) {
			System.out.println("Valor 2 é maior que a media");
		} else if(valor3>media) {
			System.out.println("Valor 3 é maior que a média");
		} else if (valor4>media) {
			System.out.println("Valor 4 é maior que a média");
		} else {
			System.out.println("Nenhum valor digitado é maior que a média");
		}

	}

}
