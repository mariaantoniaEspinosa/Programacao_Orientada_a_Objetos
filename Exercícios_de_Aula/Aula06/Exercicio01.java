package pkg;

public class PrincipalProduto {

	public static void main(String[] args) {
		Produto p = new Produto("abacaxi", 10.0, 5);
		
		System.out.println("Produto:" +p.nome);
		
		if(p.temEstoque()) {
			System.out.println("Total do produto em estoque: " + p.quantidade);
		} else {
			System.out.println("Produto fora de estoque");
		}
		
		System.out.println("Valor total em reais: " + p.calcularValorTotalEstoque());
		
		System.out.println("Adiconando produto ao estoque");
		p.adicionarEstoque(5);
		
		System.out.println("Novo estoque: " + p.quantidade);
		
		if(p.vender(2)) {
			System.out.println("Venda realizada");
		} else {
			System.out.println("Produto fora de estoque");
		}
		
		System.out.println("Estoque final: " + p.quantidade);
		System.out.println("Valor em reais do estoque: " + p.calcularValorTotalEstoque());

	}

}
