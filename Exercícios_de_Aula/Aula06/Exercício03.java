package pkg;

public class PrincipalRetangulo {

	public static void main(String[] args) {
		Retangulo r = new Retangulo(10, 10);
		
		System.out.println("Area do retangulo: " + r.calcularArea());
		System.out.println("Perimetro do retangulo: " + r.calcularPerimetro());
		System.out.println("Diagonal do retangulo: " + r.calcularDiagonal());
		System.out.println("É quadrado? " + r.quadrado());
	}

}
