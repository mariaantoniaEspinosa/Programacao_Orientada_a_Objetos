package pkg;

import java.util.Scanner;

public class Exercício04 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String [] nomes = {"Ana", "Carlos", "Maria", "Pedro", "Guilherme"};
		int opcao;
			
		try {
			System.out.println("Digite uma opçao de 0 até 4: ");
			opcao = teclado.nextInt();
			System.out.println("Posição escolhida: " + nomes[opcao]);
		} catch ( ArrayIndexOutOfBoundsException e) {
			System.out.println("Opção inválida");
		}  catch (Exception e) {
			System.out.println("Exceção: " + e.toString());
		}

	}

}
