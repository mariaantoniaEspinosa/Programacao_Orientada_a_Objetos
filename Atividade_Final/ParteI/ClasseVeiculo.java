package pkj;

public class Veiculo {

    private String placa;
    private String modelo;
    private String marca;
    private int ano;
    private double quilometragem;

    public Veiculo(String placa, String modelo, String marca, int ano, double quilometragem) {
		super();
		this.placa = placa;
		this.modelo = modelo;
		this.marca = marca;
		this.ano = ano;
		this.quilometragem = quilometragem;
	}

	public String getPlaca() {
		return placa;
	}

	public String getModelo() {
		return modelo;
	}

	public String getMarca() {
		return marca;
	}

	public int getAno() {
		return ano;
	}

	public double getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }
    @Override
    public String toString() {
        return placa + "; " + modelo + "; " + marca + "; " + ano + "; " + quilometragem + ".";
    }
}
