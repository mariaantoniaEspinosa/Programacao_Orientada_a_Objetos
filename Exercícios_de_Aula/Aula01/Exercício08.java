package pkg;

import java.util.Scanner;

public class Exercício08 {

	public static void main(String[] args) {
		
		int idade;
		
		Scanner teclado = new Scanner(System.in);
				
		System.out.println("Digite sua idade: ");
		idade = teclado.nextInt();
		
		if(idade<16) {
			System.out.println("Não está apto a votar");
		} else if ((idade>=16 && idade<18 ) || idade>70) {
			System.out.println("Voto facultativo");
		} else {
			System.out.println("Voto obrigatório");
		}

	}

}
