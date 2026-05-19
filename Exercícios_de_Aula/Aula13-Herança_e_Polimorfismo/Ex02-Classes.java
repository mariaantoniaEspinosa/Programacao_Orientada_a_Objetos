package pacote2;

public class Produto {
	protected String produto;
	protected int valor;

	public Produto(String produto, int valor) {
		super();
		this.produto = produto;
		this.valor = valor;
	}

	public double desconto() {
		return this.valor;
	}
}
////////////////////////////////////////////////////////////////////////////
package pacote2;

public class ProdutoComDesconto extends Produto{
	
	protected double taxa;
	
	public ProdutoComDesconto(String produto, int valor, double taxa) {
		super(produto, valor);
		this.taxa = taxa;
	}


	public double desconto() {
		double valorDesc = this.valor  * this.taxa;
		double precoFinal = this.valor - valorDesc;
		
		System.out.println("Produto: " + this.produto);
		System.out.println("Preço original: " + this.valor);
		System.out.println("Preço com desconto: " + precoFinal);
		
		return precoFinal ;
		
	}
}
