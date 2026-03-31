package pkg;

public class Retangulo {
	public double largura, altura;
	
	public Retangulo (double l, double a) {
		largura = l;
		altura = a;
	}
	
	public double calcularArea() {
		return largura * altura;
	}
	
	public double calcularPerimetro() {
		return 2 * (largura + altura);
	}
	
	public double calcularDiagonal() {
		return Math.sqrt(Math.pow(largura, 2) + Math.pow(altura, 2));
	}
	
	public boolean quadrado() {
		if(largura == altura) {
			return true;
		} else {
			return false;
		}
	}
}
