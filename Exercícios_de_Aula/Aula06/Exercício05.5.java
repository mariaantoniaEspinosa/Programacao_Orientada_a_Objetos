package pkg;

public class Carro {
	public String modelo;
	public double velocidadeAtual, velocidadeMaxima;
	
	public Carro (String m, double va, double vm ) {
		modelo = m;
		velocidadeAtual = va;
		velocidadeMaxima = vm;
	}
	
	public void acelerar(int valor) {
		velocidadeAtual += valor;
		
		if(velocidadeAtual > velocidadeMaxima) {
			velocidadeAtual = velocidadeMaxima;
		}
	}
	
	public void frear(int valor) {
		velocidadeAtual -= valor;
		
		if(velocidadeAtual < 0) {
			velocidadeAtual = 0;
		}
	}
	
	public boolean atingiuVelocidadeMaxima() {
		return velocidadeAtual == velocidadeMaxima;
	}
	
	public double calcularTempoViagem(double distancia) {
		if(velocidadeAtual == 0) {
			return 0;
		}
		return distancia / velocidadeAtual;
	}
}
