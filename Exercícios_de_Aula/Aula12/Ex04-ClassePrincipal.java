package pacote1;

import java.util.ArrayList;
import java.util.List;

import pacote.Pessoa;

public class Principal {

	public static void main(String[] args) {
		List<Livro> livros = new ArrayList<Livro>();

		Livro l = new Livro ("Harry Potter", "JK", 2000);
		Livro l2 = new Livro ("Diario de um banana", "Ciclano", 2011);
		Livro l3 = new Livro ("As cronicas de Narnia", "Beltrano", 1987);
		
		livros.add(l);
		livros.add(l3);
		livros.add(l2);
		
		ordemLancamento(livros);

	}
	
	public static void ordemLancamento(List<Livro> L){
	    L.sort((l1, l2) -> l1.getAno() - l2.getAno());
		for (Livro livros : L) {
			System.out.println(livros.getTitulo() + " " + livros.getAno());
		}
	}
}
