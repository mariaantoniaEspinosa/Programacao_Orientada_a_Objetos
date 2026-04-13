package pkg;

import java.util.Scanner;

public class PrincipalCarro {

	public static void main(String[] args) {
		Carro c = new Carro ("Honda", "X", 2001);
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Digite a marca do carro: ");
		c.setMarca(teclado.nextLine());
		
		System.out.println("Digite o modelo do carro: ");
		c.setModelo(teclado.nextLine());
		
		System.out.println("Digite o ano do carro: ");
		c.setAno(teclado.nextInt());
		
		c.exibir();
		
		teclado.close();

	}

}
