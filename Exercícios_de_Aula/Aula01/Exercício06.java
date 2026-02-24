package pkg;

import java.util.Scanner;

public class Exercício06 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int valor1, valor2, valor3;
		int auxiliar;
		
		System.out.println("Digite um valor: ");
		valor1 = teclado.nextInt();
		
		System.out.println("Digite outro valor: ");
		valor2 = teclado.nextInt();
		
		System.out.println("Digite outro valor: ");
		valor3 = teclado.nextInt();
		
		if(valor1> valor2 ) {
			auxiliar = valor1;
			valor1 = valor2;
			valor2 = auxiliar;
		} 
		if(valor1> valor3) {
			auxiliar = valor1;
			valor1 = valor3;
			valor3 = auxiliar;
		}
		if(valor2> valor3) {
			auxiliar = valor2;
			valor2 = valor3;
			valor3 = auxiliar;
		}
		System.out.println(valor1);
		System.out.println(valor2);
		System.out.println(valor3);

	}

}
