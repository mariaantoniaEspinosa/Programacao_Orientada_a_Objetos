package ufn;

import java.util.ArrayList;
import java.util.List;

public class Principal {
	public static void main(String[] args) {
		List<Produto> listaProdutos = new ArrayList<Produto>();
		
		Produto p1 = new Produto ("Acabaxi", 2.99, 5);
		Produto p2 = new Produto ("Maça", 0.99, 3);
		Produto p3 = new Produto ("Abobora", 4.99, 5);
		
		listaProdutos.add(p1);
		listaProdutos.add(p2);
		listaProdutos.add(p3);
		
		exibirProdutos(listaProdutos);
		
	}
	
	public static void exibirProdutos(List<Produto> lista) {
		for(Produto p : lista) {
			System.out.println("Nome: " + p.getNome());
			System.out.println("Preço: " + p.getPreco());
			System.out.println("Quantidade: " + p.getQuantidade());
		}
	}
}
