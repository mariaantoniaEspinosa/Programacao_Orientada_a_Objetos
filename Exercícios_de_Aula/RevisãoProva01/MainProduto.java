package pkg;

import java.util.Scanner;

public class MainProduto {

	public static void main(String[] args) {
		Produto p1 = new Produto ("abacaxi", 1.99, 3);
		String nome = null;
		double preco = 0;
		int quantidade = 0;
		Produto p2 = new Produto (nome, preco, quantidade);
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o nome do produto 2: ");
		p2.nome = teclado.nextLine();
		System.out.println("Digite o preço do produto 2: ");
		p2.preco = teclado.nextDouble();
		System.out.println("Digite a quantia em estoque do produto 2: ");
		p2.quantidade = teclado.nextInt();
		
		p1.exibirInformacoes();
		System.out.println("O valor total em estoque do produto 1 é: " + p1.calcularValorTotal());
		
		p2.exibirInformacoes();
		System.out.println("O valor total em estoque do produto 2 é: " + p2.calcularValorTotal());
		
	}

}
