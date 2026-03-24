package pkg;

import java.util.Scanner;

public class Exercício05 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String temperatura;
		double novaTemperatura;
		double temp;
		
		try {
			System.out.println("Digite a temepratura que deseja converter de celsius para fahrenheit: ");
			temperatura = teclado.nextLine();
			temp =  Double.parseDouble(temperatura); 
			novaTemperatura = (temp * 1.8) + 32;
			System.out.println("Temperatura convertida: " + novaTemperatura);
		} catch ( NumberFormatException e) {
			System.out.println("Erro: variável inválida");
		} catch (Exception e) {
			System.out.println("Exceção: " + e.toString());
		}

	}

}
