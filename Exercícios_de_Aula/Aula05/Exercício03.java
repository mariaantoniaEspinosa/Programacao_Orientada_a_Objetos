package pkg;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercício03 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int inteiro;
		double doub;
		boolean bool;
		
		try {
			System.out.println("Digite um valor inteiro: ");
			inteiro = teclado.nextInt();
			System.out.println("Seu inteiro é: " + inteiro);
		} catch (InputMismatchException e) {
			System.out.println("Entrada inválida: " + e.toString());
			teclado.nextLine();
		} catch (Exception e) {
			System.out.println("Exceção: " + e.getMessage());
		}
		
		try {
			System.out.println("Digite um valor decimal: ");
			doub = teclado.nextDouble();
			System.out.println("Seu double é: " + doub);
		} catch (InputMismatchException e) {
			System.out.println("Entrada inválida: " + e.toString());
			teclado.nextLine();
		} catch (Exception e) {
			System.out.println("Exceção: " + e.getMessage());
		}
		
		try {
			System.out.println("Digite um valor booleano: ");
			bool = teclado.nextBoolean();
			System.out.println("Seu booleano é: " + bool);
		} catch (InputMismatchException e) {
			System.out.println("Entrada inválida: " + e.toString());
		}  catch (Exception e) {
			System.out.println("Exceção: " + e.getMessage());
		}
	}

}
