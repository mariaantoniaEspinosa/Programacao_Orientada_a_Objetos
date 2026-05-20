package pacote5;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Produto p = new Produto();
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Preço do Produto: ");
		double preco = teclado.nextDouble();
		
		System.out.println("% de desconto do cliente: ");
		double desconto = teclado.nextDouble();
		
		Cliente c = new Cliente(desconto);
		
		System.out.println("Preço inicial: " + p.calcularPrecoFinal(preco));
		System.out.println("Preço com desconto do Cliente: " + p.calcularPrecoFinal(preco, c));
	}
}
