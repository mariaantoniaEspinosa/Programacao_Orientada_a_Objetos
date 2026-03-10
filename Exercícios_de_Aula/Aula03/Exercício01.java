package pkg;

import java.util.Scanner;

public class ExecutavelCarro {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		Carro c1 = new Carro();
		Carro c2 = new Carro();
		
		System.out.println("Digite a marca do carro 1: ");
		c1.marca = teclado.nextLine();
		
		System.out.println("Digite o modelo do carro: ");
		c1.modelo = teclado.nextLine();
		
		System.out.println("Digite o ano de fabrição do carro: ");
		c1.anoFabricacao = teclado.nextInt();
		teclado.nextLine();
		
		//
		
		System.out.println("Digite a marca do carro 2: ");
		c2.marca = teclado.nextLine();
		
		System.out.println("Digite o modelo do carro: ");
		c2.modelo = teclado.nextLine();
		
		System.out.println("Digite o ano de fabrição do carro: ");
		c2.anoFabricacao = teclado.nextInt();
		teclado.nextLine();
		
		//
		
		System.out.println("Características do Carro 1");
		System.out.println("Marca: " + c1.marca);
		System.out.println("Modelo: " + c1.modelo);
		System.out.println("Ano: " + c1.anoFabricacao);
		
		//
		
		System.out.println("Características do Carro 2");
		System.out.println("Marca: " + c2.marca);
		System.out.println("Modelo: " + c2.modelo);
		System.out.println("Ano: " + c2.anoFabricacao);
		
	}

}
