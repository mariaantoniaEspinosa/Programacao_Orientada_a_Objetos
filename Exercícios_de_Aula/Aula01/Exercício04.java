package pkg;

import java.util.Scanner;

public class Exercício04 {

	public static void main(String[] args) {
		
		float x, y;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o valor do ponto X: ");
		x = teclado.nextFloat();
		
		System.out.println("Digite o valor do ponto Y: ");
		y = teclado.nextFloat();
		
		if(x>0 && y>0) {
			System.out.println("Ponto no primeiro quadrante");
		}
		else if(x<0 && y<0) {
			System.out.println("Ponto no terceiro quadrante");
		}
		else if(x<0 && y>0) {
			System.out.println("Ponto no segundo quadrante");
		}
		else if(x>0 && y<0) {
			System.out.println("Ponto no quarto quadrante");
		}
		
		

	}

}
