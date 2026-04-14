package pkg;

import java.util.Scanner;

public class PrincipalProduto {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		Produto p1 = new Produto("abacaxi", 3.99, 4);

		String produto;
		int quantidade;
		double preco;
		
		System.out.println("Digite o nome do produto: ");
		produto = teclado.nextLine();
		
		System.out.println("Digite o preco do produto: ");
		preco = teclado.nextDouble();
		
		System.out.println("Digite a quantidade do produto em estoque: ");
		quantidade = teclado.nextInt();
		
		teclado.nextLine();
		
		Produto p2 = new Produto(produto, preco, quantidade);
	
		
		p1.exibirInformacoes();
		p1.calcularValorTotal();
		
		p2.exibirInformacoes();
		p2.calcularValorTotal();
		
		

	}

}
