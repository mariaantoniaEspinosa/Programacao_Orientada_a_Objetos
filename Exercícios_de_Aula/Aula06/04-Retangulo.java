package pkg;

public class Retangulo {
	double largura;
	double altura;
	
	public Retangulo(double largura, double altura) {
		this.largura = largura;
		this.altura = altura;
	}
	
	public double calcularArea() {
		return largura * altura;
	}
	
	public double calcularPerimetro() {
		return 2 * (largura + altura);
	}
	
	public double calcularDiagonal() {
		return Math.sqrt((largura * altura) + (altura * altura));
	}
	
	public boolean quadrado() {
		return largura == altura;
	}
	
}
