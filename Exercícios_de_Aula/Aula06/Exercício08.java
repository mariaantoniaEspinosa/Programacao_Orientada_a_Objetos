package pkg;

public class PrincipalLivro {

	public static void main(String[] args) {
		Livro l = new Livro ("Harry Potter", "JK", 200, false);
		
		System.out.println(l.detalhesLivro());
		System.out.println("Emprestimo");
		if(l.emprestar()) {
			System.out.println("Livro emprestado com sucesso");
		} else {
			System.out.println("Livro já emprestado");
		}
		
		System.out.println("Status atual: ");
		System.out.println(l.detalhesLivro());
		
		System.out.println("Devolução");
		l.devolver();
		
		System.out.println("Status final do livro: ");
		System.out.println(l.detalhesLivro());

	}

}
