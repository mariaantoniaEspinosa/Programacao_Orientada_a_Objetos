package pkg2;

public class principal {
	public static void main(String[] args) {
		Circulo c = new Circulo(3.4);
		
		System.out.println("CIRCULO");
		System.out.println("Area do circulo: " + c.area());
		System.out.println("Perimetro do circulo: " + c.perimetro());
		
		Retangulo r = new Retangulo (3.7, 8.3);
		System.out.println("RETANGULO");
		System.out.println("Area do retangulo: " + r.area());
		System.out.println("Perimetro do retangulo: " + r.perimetro());
	}
}
