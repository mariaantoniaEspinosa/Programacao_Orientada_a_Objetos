package pacote1;

public class Notebook extends Computador{

	public Notebook(String marca, String modelo) {
		super(marca, modelo);
	}

	public String exibeMarca() {
		return this.marca;
	}

}
