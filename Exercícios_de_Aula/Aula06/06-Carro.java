package pkg;

public class Carro {
	String modelo;
	float velocidadeAtual, velocidadeMaxima;
	
	public Carro(String modelo, float velocidadeAtual, float velocidadeMaxima) {
		this.modelo = modelo;
		this.velocidadeAtual = velocidadeAtual;
		this.velocidadeMaxima = velocidadeMaxima;
	}
	
	public float acelerar(int valor) {
		velocidadeAtual += valor;
		if(velocidadeAtual > velocidadeMaxima) {
			velocidadeAtual = velocidadeMaxima;
		}
		return velocidadeAtual;
	}
	
	public float frear(int valor) {
		velocidadeAtual -= valor;
		if(velocidadeAtual<0) {
			velocidadeAtual = 0;
		}
		return velocidadeAtual;
	}
	
	public boolean atingiuVelocidadeMaxima() {
		if (velocidadeAtual == velocidadeMaxima) {
			return true;
		} else {
			return false;
		}
	}
	
	public double calcularTempoViagem(double distancia) {
		if(velocidadeAtual == 0) {
			System.out.println("Tempo indefinido");
		}
		return distancia/velocidadeAtual;
	}
	
}
