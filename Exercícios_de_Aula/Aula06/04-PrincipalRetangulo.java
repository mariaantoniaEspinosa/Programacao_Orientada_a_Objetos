package pkg;

public class PrincipalRetangulo {

	public static void main(String[] args) {
		Retangulo r = new Retangulo(15, 10);
		
		System.out.println("Area: " + r.calcularArea());
		System.out.println("Perimetro: " + r.calcularPerimetro());
		System.out.println("Diagonal: " + r.calcularDiagonal());
		System.out.println("É quadrado? " + r.quadrado());
		
	}

}
