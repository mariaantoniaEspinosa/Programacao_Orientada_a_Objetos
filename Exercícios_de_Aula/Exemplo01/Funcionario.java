package pkg;

public abstract class Funcionario {
	protected String nome;
	protected double salarioBase;
	
	public void exibirDados() {
		System.out.println("Nome: " + nome);
		System.out.println("Salário base: " + salarioBase);
	}
	
	public abstract double calcularSalarioFinal();
}
