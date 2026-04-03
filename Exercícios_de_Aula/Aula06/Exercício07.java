package pkg;

import java.util.Scanner;

public class PrincipalFilme {

	public static void main(String[] args) {
		Filme f = new Filme("Harry Potter",200, 10);
		Scanner teclado = new Scanner (System.in);
		int idade;
		
		System.out.println("Filme: " + f.titulo);
		System.out.println("Duração em horas: " + f.converterDuracaoHoras());
		System.out.println("Digite sua idade: ");
		idade = teclado.nextInt();
		System.out.println("Pode assistir? " + f.podeAssistir(idade));
		System.out.println("Informações do filme: " + f.descricaoFilme());
		
		teclado.close();
	}

}
