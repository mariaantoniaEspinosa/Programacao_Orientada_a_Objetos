package pacote2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o nome do produto: ");
		String nome = teclado.nextLine();
		
		System.out.println("Digite o preço do produto: ");
		double preco = teclado.nextDouble();
		
		System.out.println("Digite o total de desconto em reais: ");
		double desconto = teclado.nextDouble();
		
		ProdutoComDesconto p = new ProdutoComDesconto (nome, preco, desconto);
		
		p.desconto();

	}

}
