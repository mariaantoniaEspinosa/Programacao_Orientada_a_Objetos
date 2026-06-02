package pkg3;

public class Principal {

	public static void main(String[] args) {
		Cachorro c = new Cachorro();
		c.nome = "Caramelo";
		c.idade = 3;
		c.raca = "SRD";
		c.exibirInfo();
		c.emitirSom();
		System.out.println(c.verificarVacinacao());
		
		Gato g = new Gato();
		g.exibirInfo();
		g.emitirSom();
		System.out.println(g.verificarVacinacao());
	}

}
