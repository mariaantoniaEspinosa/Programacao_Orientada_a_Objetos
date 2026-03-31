package pkg;

public class Funcionario {
	public String nome;
	public double salario;
	public int horaExtra;
	
	public Funcionario(String n, double s, int h) {
		nome = n;
		salario = s;
		horaExtra = h;
	}
	
	public double calcularValorHoraExtra() {
		return horaExtra *50;
	}
	
	public double calcularPagamentoTotal() {
		return calcularValorHoraExtra() + salario;
	}
	
	public double salarioAnual() {
		return salario * 12;
	}
	
	public void adicionarHorasExtras(int horas) {
		horaExtra += horas;
	}
}
