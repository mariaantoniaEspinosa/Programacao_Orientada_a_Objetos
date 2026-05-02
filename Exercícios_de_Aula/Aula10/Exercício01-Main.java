package pacote;

public class Main {
	public static void main(String[] args) {
		Retangulo r = new Retangulo();
		
		r.cor = "Verde";
		r.preenchido = true;
		r.largura = 2;
		r.altura = 2;
		
		System.out.println("Cor: " + r.cor);
        System.out.println("Preenchido: " + r.preenchido);
        System.out.println("Largura: " + r.largura);
        System.out.println("Altura: " + r.altura);
        System.out.println("Área: " + r.calcularArea());
	}
}
