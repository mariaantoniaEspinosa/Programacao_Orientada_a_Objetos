package pacote1;

public class Triangulo extends FormaGeometrica{
	
	double base, altura;
	
	public Triangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	
	public void calcularArea() {
		super.calcularArea();
		System.out.println("Área do triângulo: " + ((base*altura)/2));
	}
}
