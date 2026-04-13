package pkg;

import java.util.Scanner;

public class PrincipalRetangulo {

	public static void main(String[] args) {
		Retangulo r = new Retangulo(2,3);
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Digite o valor da base: ");
		r.setBase(teclado.nextDouble());
		
		System.out.println("Digite o valor da altura: ");
		r.setAltura(teclado.nextDouble());
		
		System.out.println("A área será: " + r.calcularArea());
		
		teclado.close();
	}

}
