package pacote4;

public class Casa {
	public void calcularPreco(int tamanho) {
		System.out.println("O preço da casa é: " + (tamanho*500.00));
	}
	
	public void calcularPreco(int tamanho, int quartos) {
		System.out.println("O preço com quartos fica: " + ((tamanho * 500.00) + (quartos * 100.00)));
	}
}
