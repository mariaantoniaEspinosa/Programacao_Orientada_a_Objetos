package pkg;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		FuncionarioCLT clt = new FuncionarioCLT();
		
		System.out.println("Nome do funcionário CLT: ");
		clt.nome = teclado.nextLine();
		System.out.println("Digite o salário base do funcionário CLT:");
		clt.salarioBase = teclado.nextDouble();
		
		clt.exibirDados();
		clt.calcularSalarioFinal();
		
		teclado.nextLine();
		
		FuncionarioPJ pj = new FuncionarioPJ();
		
		System.out.println("Nome do funcionario PJ: ");
		pj.nome = teclado.nextLine();
		System.out.println("Digite o salário base do funcionário PJ:");
		pj.salarioBase = teclado.nextDouble();
		
		pj.exibirDados();
		pj.calcularSalarioFinal();
	}
}
