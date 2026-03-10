package pkg;

import java.util.Scanner;

public class ExecutavelComputador {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Computador c1 = new Computador();
		Computador c2 = new Computador();
		
		System.out.println("Digite a marca do computador: ");
		c1.marca = teclado.nextLine();
		System.out.println("Digite o modelo do computador: ");
		c1.modelo = teclado.nextLine();
		System.out.println("Digite o tipo de computador: ");
		c1.tipo = teclado.nextLine();
		
		System.out.println("O modelo 1 é " + c1.modelo);
		System.out.println("A marca do modelo 1 é " + c1.marca);
		System.out.println("O tipo de computador 1 é " + c1.tipo);
		
		c2.marca = "Lenovo";
		c2.modelo = "G15V";
		c2.tipo = "Notebook";
		
		System.out.println("O modelo 2 é " + c2.modelo);
		System.out.println("A marca do modelo 2 é " + c2.marca);
		System.out.println("O tipo de computador 2 é " + c2.tipo);

	}

}
