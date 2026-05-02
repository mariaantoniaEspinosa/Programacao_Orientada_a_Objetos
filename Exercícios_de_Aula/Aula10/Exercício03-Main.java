package pacote3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Pessoa p = new Pessoa ();
		
		System.out.print("Informe o nome: ");
        p.nome = teclado.nextLine();

        System.out.print("Informe a idade: ");
        p.idade = teclado.nextInt();
        teclado.nextLine();

        System.out.print("Informe o tipo: ");
        p.tipo = teclado.nextLine();
        
        System.out.println("Nome: " + p.nome);
        System.out.println("Idade: " + p.idade);
        System.out.println("Tipo: " + p.tipo);
        System.out.println(p.falar());
        p.andar();

        teclado.close();
        

	}

}
