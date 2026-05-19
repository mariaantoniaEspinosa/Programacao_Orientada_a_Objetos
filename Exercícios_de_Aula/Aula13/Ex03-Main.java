package pacote3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o salário base dos funcionários: ");
		double salarioBase = teclado.nextDouble();
		
		System.out.println("Digite o valor do bônus: ");
		double bonus = teclado.nextDouble();
		
		Gerente g = new Gerente("Carlos", salarioBase, bonus);
		
		g.calcularSalario();
	}
}
