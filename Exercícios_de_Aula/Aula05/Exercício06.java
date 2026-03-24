package pkg;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercício06 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		double premio = 5000.0;
		int ganhadores;
		double div;
		
		try {
			System.out.println("Digite quantos ganhdores irão receber o prêmio: ");
			ganhadores = teclado.nextInt();
			div = premio / ganhadores;
			System.out.println("O total do prêmio para cada pessoa será de " + div);;
			
			
		} catch (ArithmeticException e) {
			System.out.println("Erro: divisão por zero");
		} catch (InputMismatchException e) {
			System.out.println("Erro: variável inválida");
		} catch (Exception e) {
			System.out.println("Exceção: " + e.toString());
		}

	}

}
