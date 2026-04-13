package pkg;

import java.util.Scanner;

public class PrincipalCirculo {

	public static void main(String[] args) {
		Circulo c = new Circulo(0);
		Scanner teclado = new Scanner (System.in);
		double raio;
		
		System.out.println("Digite o valor do raio para calcular a área de um circulo: ");
		c.setRaio(teclado.nextDouble());
		
		System.out.println("A área será: " + c.calculaArea());
		
		teclado.close();
	}
}
