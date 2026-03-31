package pkg;

import java.util.Scanner;

public class Produto {
	String nome;
	float preco;
	int quantidade;
	
	Scanner teclado = new Scanner (System.in);
	
	public Produto(String n, float p, int q) {
		nome = n;
		preco = p;
		quantidade = q;
	}
	
	public float calcularValorTotalEstoque() {
		float total;
		total = preco * quantidade;
		System.out.println("O valor total em reais no estoque é: R$ " + total);
		return total;
	}
	
	public boolean temEstoque() {
		return quantidade >0;
	}
	
	public int adicionarEstoque(int quantidade) {
		int opcao;
		int novaquantia;
	
		System.out.println("Deseja adicionar produtos ao estoque? (1 - sim / 2 - nao: ");
		opcao = teclado.nextInt();
		
		if(opcao == 1 ) {
			System.out.println("Digite a quantidade que deseja incluir: ");
			novaquantia = teclado.nextInt();
			this.quantidade += novaquantia;
			
		} else {
			System.out.println("Não houve mudanças no estoque");
		}
		System.out.println("Seu estoque atual é: " + this.quantidade);
		return this.quantidade;
	}
	
	public int vender(int quantidade) {
		int opcao;
		int novaquantia;
		boolean vendeu;
		
		System.out.println("Houve produto vendido? (1 - sim / 2 - nao: ");
		opcao = teclado.nextInt();
		
		if(opcao == 1) {
			System.out.println("Digite a quantidade que deseja diminuir do estoque: ");
			novaquantia = teclado.nextInt();
			this.quantidade -= novaquantia;
			vendeu = true;
		} else {
			System.out.println("Não houve mudanças no estoque ");
			vendeu = false;
		}
		System.out.println("Seu estoque atual é: " + this.quantidade);
		return quantidade;
	}
}
