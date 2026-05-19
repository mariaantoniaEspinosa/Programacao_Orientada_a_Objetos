package pacote2;

public class ProdutoComDesconto extends Produto{
	
	private double desconto;

	public ProdutoComDesconto(String nome, double preco, double desconto) {
		super(nome, preco);
		this.desconto = desconto;
	}
	
	@Override
	
	public void desconto() {
		double valorComDesconto = preco - desconto;
		System.out.println("Preço do produto " + nome + " com desconto: R$ " + valorComDesconto);
	}
}
