package pkg;

public class Pedido {
	public int numero;
	public String produto;
	public double preco;
	public int quantidade;
	
	public Pedido (int n, String p, double pr, int quantia) {
		numero = n;
		produto = p;
		preco = pr;
		quantidade = quantia;
	}
	
	public double calcularSubtotal() {
		return preco * quantidade;
	}
	
	public double calcularDesconto(double percentual) {
		return calcularSubtotal() *(percentual /100);
	}
	
	public double calcularTotal(double percentualDesconto) {
		return calcularSubtotal() - calcularDesconto(percentualDesconto);
	}
	
	public String resumoPedido() {
		return "pedido: " + produto + "\nSubtotal: " + calcularSubtotal() + "\nTotal com desconto: " + calcularTotal(10);
		
	}
}
