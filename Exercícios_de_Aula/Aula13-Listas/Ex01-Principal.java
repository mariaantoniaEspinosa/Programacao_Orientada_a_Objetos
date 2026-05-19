package pacoteLista;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Produto> p = new ArrayList<Produto>();
		
		Produto p1 = new Produto("Abacaxi", 5.99, 3);
		Produto p2 = new Produto("Maça", 4.88, 2);
		
		p.add(p1);
		p.add(p2);
		
		exibirProdutos(p);
		
	}
	
	public static void exibirProdutos(List<Produto> lista) {
		for(Produto prod : lista) {
			System.out.println("Nome: " + prod.getNome());
			System.out.println("Preço: " + prod.getPreco());
			System.out.println("Quantidade: " + prod.getQuantidade());
		}
	}
}
