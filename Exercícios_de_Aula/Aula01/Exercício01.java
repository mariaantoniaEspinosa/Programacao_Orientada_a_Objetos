package pkg;

import java.util.Scanner;

public class Exercício01 {

	public static void main(String[] args) {
		int numero1;
		int numero2;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		numero1 = teclado.nextInt();
		System.out.println("Digite o segundo número: ");
		numero2 = teclado.nextInt();
		
		int soma;
		int sub;
		int mult;
		int div;
		
		soma = numero1 + numero2;
		sub = numero1 - numero2;
		mult = numero1 * numero2;
		div = numero1 / numero2;
		
		System.out.println("Sua soma: " + soma);
		System.out.println("Sua subtração: " + sub);
		System.out.println("Sua multiplicação: " + mult);
		System.out.println("Sua divisão do primeiro número pelo segundo: " + div);

	}

}
