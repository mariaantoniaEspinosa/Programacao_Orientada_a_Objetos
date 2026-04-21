package pkg;

import java.util.Scanner;

public class MainFilme {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		Filme f = new Filme (null, null, 0, null);
		
		System.out.println("Digite o título do filme: ");
		f.titulo = teclado.nextLine();
		
		System.out.println("Digite o diretor: ");
		f.diretor = teclado.nextLine();
		
		System.out.println("Digite a duração do filme em minutos: ");
		f.duracaoEmMinutos = teclado.nextInt();
		
		teclado.nextLine();
		
		System.out.println("Digite o geenero do filme: ");
		f.genero = teclado.nextLine();
		
		f.exibirDetalhes();
		f.ehLongo();
		
		

	}

}
