package pkg;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercício02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int a=0, b=0;
		
		try {
			System.out.println("Digite um numero: ");
			a = teclado.nextInt();
			System.out.println("Digite outro número: ");
			b = teclado.nextInt();
			int soma = a + b;
			int sub = a - b;
			int mult = a * b;
			System.out.println("\n Soma: " + soma + "\n Subtração: " + sub + "\n Multiplicação: " + mult);
		} catch (InputMismatchException e) {
			System.out.println("Erro: tipo de variável inválida!");
			return;
		} catch (Exception e) {
			System.out.println("Exceção: " + e.getMessage());
			return;
		}
		
		try {
			int div = a / b;
			System.out.println(" Divisão: "+ div);
		}  catch (InputMismatchException e) {
			System.out.println("Erro: tipo de variável inválida!");
		}  catch (ArithmeticException e) {
			System.out.println("Erro: divisão por zero!");
		}

	}

}
