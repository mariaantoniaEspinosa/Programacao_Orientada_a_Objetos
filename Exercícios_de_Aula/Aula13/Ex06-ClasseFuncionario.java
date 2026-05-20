package pacote6;

public class Funcionario {
	protected String nome;
	protected double salario;
	
	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}
	
	public void aumentarSalario(double porcentagem) {
		salario = salario * porcentagem / 100;
	}
	
	public String toString() {
		return "Nome: " + nome + "\nSalário: " + salario;
	}
}
