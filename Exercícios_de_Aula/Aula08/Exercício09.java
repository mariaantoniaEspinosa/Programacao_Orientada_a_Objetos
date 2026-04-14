package pkg;

import java.util.Scanner;

public class PrincipalFilme {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		Filme f = new Filme();
		
		System.out.println("Digite o título do filme: ");
		f.titulo = teclado.nextLine();
		
		System.out.println("Digite o diretor do filme: ");
		f.diretor = teclado.nextLine();
		
		System.out.println("Digite a duração do filme em minutos: ");
		f.duracaoEmMinutos = teclado.nextInt();
		
		teclado.nextLine();
		
		System.out.println("Digite o genero do filme: ");
		f.genero = teclado.nextLine();
		
		f.exibirDetalhes();
		System.out.println("O filme é considerado longo? " + f.ehLongo());

	}

}
