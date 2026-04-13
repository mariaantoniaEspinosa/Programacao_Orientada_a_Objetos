package pkg;

import java.util.Scanner;

public class PrincipalTriangulo {

	public static void main(String[] args) {
		Triangulo t = new Triangulo(3, 3, 3);
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o lado A do Triangulo: ");
		t.setLadoA(teclado.nextDouble());
		
		System.out.println("Digite o lado B do Triangulo: ");
		t.setLadoB(teclado.nextDouble());
		
		System.out.println("Digite o lado C do Triangulo: ");
		t.setLadoC(teclado.nextDouble());
		
		if (t.verificarEquilatero()) {
			System.out.println("Triangulo equilátero");
		}else {
			System.out.println("Triangulo não equilátero");
		}
		
		teclado.close();

	}

}
