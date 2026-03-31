package pkg;

public class Funcionario {
	String nome;
	float salario, horasExtras;
	
	public Funcionario(String nome, float salario, float horasExtras) {
		this.nome = nome;
		this.salario = salario;
		this.horasExtras = horasExtras;
	}
	
	public float calcularValorHoraExtra() {
		return horasExtras * 50;
	}
	
	public float calcularPagamentoTotal() {
		return salario + calcularValorHoraExtra();
	}
	
	public void adicionarHorasExtras(int horas) {
		this.horasExtras += horas;
	}
	
	public double salarioAnual() {
		return salario * 12;
	}
}
