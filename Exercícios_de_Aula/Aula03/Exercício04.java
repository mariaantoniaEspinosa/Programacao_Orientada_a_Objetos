package pkg;

import java.util.Scanner;

public class LivroExecutável {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Livro livro = new Livro();
		
		System.out.println("Digite o título do livro: ");
		livro.titulo = teclado.nextLine();
		System.out.println("Digite o nome do autor deste livro: ");
		livro.autor = teclado.nextLine();
		System.out.println("Digite o ano de lançamento do livro: ");
		livro.ano = teclado.nextInt();
		teclado.nextLine();
		
		System.out.println("O nome do livro é " + livro.titulo + " e foi lançado em " + livro.ano + " pelo autor " + livro.autor);

	}

}
