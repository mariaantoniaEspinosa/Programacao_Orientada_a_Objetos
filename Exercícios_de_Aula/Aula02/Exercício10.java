package pkg;

import java.util.Scanner;

public class Exercício10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double n, media=0, somatorio=0;
		int i=0;
		while(true) {
			System.out.println("Digite um valor: ");
			n = teclado.nextDouble();
			somatorio+=n;
			if(n==0) {
				break;
			}
			i++;
		}
		media = somatorio/i;
		System.out.println("Media: " + media);

	}

}
