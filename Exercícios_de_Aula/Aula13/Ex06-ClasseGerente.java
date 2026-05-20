package pacote6;

public class Gerente extends Funcionario{

	double bonus;
	
	public Gerente(String nome, double salario, double bonus) {
		super(nome, salario);
		this.bonus = bonus;
	}
	
	public void aumentarSalario(double porcentagem, double bonus) {
		salario = salario * porcentagem / 100;
		salario = salario + bonus;
	}
	
	public String toString() {
		return "Gerente " + nome + "\nSalário: " + salario + "\nBonus: " + bonus;
	}
}
