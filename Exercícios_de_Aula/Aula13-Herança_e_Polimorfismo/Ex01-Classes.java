package pacote1;

public class Computador {
	protected String marca;
	private String modelo;
	
	public Computador(String marca, String modelo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String exibeMarca() {
		return marca;
	}
	
	public String exibeModelo() {
		return this.modelo;
	}
	
}
///////////////////////////////////////////////////////////////
package pacote1;

public class Notebook extends Computador{
	
	public Notebook(String marca, String modelo) {
		super(marca, modelo);
	}

	public String exibeMarca() {
		return this.marca;
	}
}
//////////////////////////////////////////////////////////////
package pacote1;

public class Netbook extends Computador{
	
	public Netbook(String marca, String modelo) {
		super(marca, modelo);
	}

	public String exibeMarca() {
		return this.marca;
	}
}
