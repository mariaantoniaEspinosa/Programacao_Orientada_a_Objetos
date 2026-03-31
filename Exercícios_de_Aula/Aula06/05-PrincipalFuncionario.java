package pkg;

public class PrincipalFuncionario {

	public static void main(String[] args) {
		Funcionario f = new Funcionario ("Maria", 3000, 10);
		
		System.out.println("Nome: " + f.nome);
		System.out.println("Total R$ de horas extras: " + f.calcularValorHoraExtra());
		System.out.println("Pagamento total: " + f.calcularPagamentoTotal());
		f.adicionarHorasExtras(100);
		System.out.println("Total R$ de horas extras: " + f.calcularValorHoraExtra());
		System.out.println("Pagamento total: " + f.calcularPagamentoTotal());
		System.out.println("Salario anual: " + f.salarioAual());
	}

}
