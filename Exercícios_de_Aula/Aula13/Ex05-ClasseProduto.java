package pacote5;

public class Produto {
	
	public double calcularPrecoFinal(double preco) {
		return preco;
	}
	
	public double calcularPrecoFinal(double preco, Cliente cliente) {
		return preco - (preco * cliente.desconto/100);
	}
	
}
