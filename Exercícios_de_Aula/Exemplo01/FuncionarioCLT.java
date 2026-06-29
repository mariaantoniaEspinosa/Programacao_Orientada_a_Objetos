package pkg;

public class FuncionarioCLT extends Funcionario{
	@Override
	public double calcularSalarioFinal() {
		double novoSalario = salarioBase + 500;
		System.out.println("Salario final CLT: " + novoSalario);
		return novoSalario;
	}
}
