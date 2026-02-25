package pkg;

import java.util.Scanner;

public class Exercício01 {

	public static void main(String[] args) {
		int numero1;
		int numero2;
		int opcao;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		numero1 = teclado.nextInt();
		System.out.println("Digite o segundo número: ");
		numero2 = teclado.nextInt();
		
		System.out.println("Digite uma opção: ");
		System.out.println("Digite 1 para somar");
		System.out.println("Digite 2 para subtrair");
		System.out.println("Digite 3 para multiplicar");
		System.out.println("Digite 4 para dividir");
		System.out.println("Digite 5 para sair");
		opcao = teclado.nextInt();
		
		switch(opcao) {
		case 1:
			int soma;
			soma = numero1 + numero2;
			System.out.println("soma = " +  soma);
			break;
		case 2:
			int sub;
			sub = numero1 - numero2;
			System.out.println("subtração = " + sub);
			break;
		case 3:
			int mult;
			mult = numero1 * numero2;
			System.out.println("multiplicação = " + mult);
			break;
		case 4:
			int div;
			div = numero1 / numero2;
			System.out.println("divisão = " + div);
			break;
		case 5:
			break;
    default:
      System.out.println("Digite uma operação válida");
      break;
		}

	}

}
