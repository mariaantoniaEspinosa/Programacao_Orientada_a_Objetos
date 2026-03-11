package pkg;

import java.util.Scanner;

public class ProdutoExecutavel {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		Produto p = new Produto();
		double total;
		
		System.out.print("Digite o nome do produto: ");
        p.nome = teclado.nextLine();

        System.out.print("Digite o preço do produto: ");
        p.preco = teclado.nextDouble();

        System.out.print("Digite a quantidade em estoque: ");
        p.quantidadeEstoque = teclado.nextInt();
        teclado.nextLine();
        
        total =  p.preco * p.quantidadeEstoque;
        
        System.out.println("Produto " + p.nome);
        System.out.println("Preço: " + p.preco);
        System.out.println("Quantidade em estoque: " + p.quantidadeEstoque);
        System.out.println("Valor total em estoque: " + total);

	}

}
