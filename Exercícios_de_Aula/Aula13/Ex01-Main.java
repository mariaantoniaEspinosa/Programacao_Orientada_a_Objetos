package pacote1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		/*Notebook note = new Notebook("Dell", "V15");
		Netbook net = new Netbook("Asus", "V14");
		
		System.out.println(note.exibeMarca());
		System.out.println(note.exibeModelo());
		System.out.println(net.exibeMarca());
		System.out.println(net.exibeModelo());*/
		
		String marcaNote, marcaNet;
		
		System.out.println("Digite a marca do notebook: ");
		marcaNote = teclado.nextLine();
		
		System.out.println("Digite a marca do netbook: ");
		marcaNet = teclado.nextLine();
		
		Notebook note = new Notebook (marcaNote, "Portátil");
		Netbook net = new Netbook (marcaNet, "Portátil");
		
		System.out.println("Notebook: " + note.exibeMarca() + " - " + note.exibeModelo());
		System.out.println("Netbook: " + net.exibeMarca() + " - " + net.exibeModelo());
		
	}
}
