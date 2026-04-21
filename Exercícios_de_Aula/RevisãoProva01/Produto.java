package pkg;

public class Produto {
	public String nome;
	public double preco;
	public int quantidade;
	
	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public void exibirInformacoes() {
		System.out.println("Produto: " + nome);
		System.out.println("Preço: " + preco);
		System.out.println("Quantia em estoque: " + quantidade);
	}
	
	public double calcularValorTotal() {
		return preco * quantidade;
	}
	
}
