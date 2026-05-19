package pacote3;

public class Funcionario {
	protected String nome;
	protected double salario;
	
	public Funcionario(String nome, double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}
	
	public void calcularSalario() {
		System.out.println("O salario é de: " + salario);
	}
}
