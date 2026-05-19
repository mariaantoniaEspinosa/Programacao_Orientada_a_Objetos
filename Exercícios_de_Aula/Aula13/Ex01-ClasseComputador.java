package pacote1;

public class Computador {
	protected String marca;
	private String modelo = "Portátil";
	
	public String exibeModelo() {
		return this.modelo;
	}
	
	public Computador() {
		
	}

	public Computador(String marca, String modelo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
	}
}
