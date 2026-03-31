package pkg;

import java.util.Scanner;

public class ProdutoPrincipal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("PRODUTO - ESTOQUE");
		
		Produto p = new Produto("abacaxi", 10.0f, 5);
		
		p.calcularValorTotalEstoque();
		
		if(p.temEstoque()) {
			System.out.println("Produtos em estoque");
		}else {
			System.out.println("Estoque vazio");
		}
		
		p.adicionarEstoque(0);
		p.vender(0);
		p.calcularValorTotalEstoque();
		
		teclado.close();
		

	}

}
