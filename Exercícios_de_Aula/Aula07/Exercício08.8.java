package pkg;

public class PrincipalRetangulo {

	public static void main(String[] args) {
		Retangulo r = new Retangulo(10, 5);
		
		r.calcular_area();
	
		r.inserir_lados(7, 3);
		r.calcular_area();

	}

}
