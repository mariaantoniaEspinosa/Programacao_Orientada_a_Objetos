package pkg;

import java.util.Scanner;

public class PrincipalLivro {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Livro l = new Livro();
		
		String titulo, autor, genero;
		int ano;
		
		System.out.println("Digite o título do livro: ");
		titulo = teclado.nextLine();
		
		System.out.println("Digite o autor do livro: ");
		autor = teclado.nextLine();
		
		System.out.println("Digite o ano de publicação do livro: ");
		ano = teclado.nextInt();
		teclado.nextLine();
		
		System.out.println("Digite o genêro do livro: ");
		genero = teclado.nextLine();
		
		System.out.println("Dados do livro: ");
		l.cadastro(titulo, autor, ano, genero);
		l.mostrar();
		
		System.out.println("Emprestimo de livro:");
		l.emprestar();
		l.mostrar();
		
		System.out.println("Devolução de livro: ");
		l.devolver();
		
		teclado.close();

	}

}
