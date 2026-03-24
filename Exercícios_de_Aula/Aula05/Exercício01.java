package pkg;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercício01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		try {
			int numero, raiz;
			System.out.println("Digite um número: ");
			numero = teclado.nextInt();
			raiz = (int) Math.sqrt(numero);
			System.out.println("Raiz quadrada: " + raiz);
			//possíveis erros
			
		} catch (InputMismatchException e) {
			System.out.println("Erro: tipo de variável inválida!");
		}
		
		catch (Exception e) {
			System.out.println("Exceção: " + e.toString());
		}

	}

}
