package pkg;

public class FuncionarioPJ extends Funcionario{
	@Override
	public double calcularSalarioFinal() {
		System.out.println("Salario final PJ: " + salarioBase);
		return salarioBase;
	}
}
