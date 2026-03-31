package pkg;

public class PrincipalFuncionario {

	public static void main(String[] args) {
		Funcionario f = new Funcionario("Maria", 3000, 15);
		
		System.out.println("Funcionario: " + f.nome);
		System.out.println("Salario: " + f.salario);
		System.out.println("Horas extras: " + f.horaExtra);
		System.out.println("Valor total em horas extras: " + f.calcularValorHoraExtra());
		System.out.println("Valor a ser recebido: " + f.calcularPagamentoTotal());
		f.adicionarHorasExtras(5);
		System.out.println("Novas horas extras: " +  f.horaExtra);
		System.out.println("Valor total em horas extras: " + f.calcularValorHoraExtra());
		System.out.println("Valor a ser recebido: " + f.calcularPagamentoTotal());
		System.out.println("Salario anual base: " + f.salarioAnual());
	}

}
