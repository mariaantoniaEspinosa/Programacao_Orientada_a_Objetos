package pacote3;

public class Gerente extends Funcionario{
	private double bonus;

	public Gerente(String nome, double salario, double bonus) {
		super(nome, salario);
		this.bonus = bonus;
	}
	
	public void calcularSalario() {
		double salarioFinal = bonus + salario;
		System.out.println("O salário do Gerente é de R$" + salarioFinal);
		
	}
}
