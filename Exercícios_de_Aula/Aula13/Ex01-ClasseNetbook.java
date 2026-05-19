package pacote1;

public class Netbook extends Computador{
	public Netbook(String marca, String modelo) {
		super(marca, modelo);
	}

	public String exibeMarca() {
		return this.marca;
	}
}
