package pacote4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Notebook note = new Notebook();
		Netbook net = new Netbook();
		
		System.out.print("Digite a marca do notebook: ");
        note.marca = teclado.nextLine();

        System.out.print("Digite a marca do netbook: ");
        net.marca = teclado.nextLine();
        
        System.out.println("Marca do notebook: " + note.exibeMarca());
        System.out.println("Modelo do notebook: " + note.exibeModelo());
        
        System.out.println("Marca do netbook: " + net.exibeMarca());
        System.out.println("Modelo do netbook: " + net.exibeModelo());

	}

}
