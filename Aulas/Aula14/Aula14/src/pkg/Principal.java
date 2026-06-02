package pkg;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		//ERRADO: Animal a = new Animal();
		
		Cachorro c = new Cachorro();
		c.emiteSom();
		
		Tigre t = new Tigre();
		t.emiteSom();
		
		Scanner teclado = new Scanner(System.in);
		int op;
		
		System.out.println("Digite 1 para instanciar um cachorro ou 2 para instanciar um tigre: ");
		op = teclado.nextInt();
		
		if(op == 1) {
			Cachorro a = new Cachorro();
			a = new Cachorro();
			a.especie = "Labrador";
			a.idade = 10;
			a.raca = "Pitbul";
			a.cuidarPatio();
			a.emiteSom();
			a.exibeInfo();
		
		} else {
			Tigre a = new Tigre();
			a = new Tigre();
			a.especie = "Tigrão";
			a.idade = 8;
			a.emiteSom();
			a.exibeInfo();
		}

	}
}
