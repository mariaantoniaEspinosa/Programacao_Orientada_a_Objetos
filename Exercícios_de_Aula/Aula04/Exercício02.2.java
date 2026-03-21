package pkg;

public class Livro {
	public String titulo;
	public String autor;
	public int ano;
	public String genero;
	public boolean emprestado;
	
	public void cadastro(String t, String a, int an, String g) {
		titulo = t;
		autor = a;
		ano = an;
		genero = g;
		emprestado = false;
	}
	
	public void mostrar() {
		System.out.println("Titulo:  " + titulo);
		System.out.println("Autor: " + autor);
		System.out.println("Ano: "+ ano);
		System.out.println("Genero: "+ genero);
		
		if(emprestado) {
			System.out.println("Emprestado");
		}else {
			System.out.println("Disponível");
		}	
	}
	
	public void emprestar() {
		if (emprestado == true) {
			System.out.println("Livro já emprestado");
		}else {
			emprestado = true;
			System.out.println("Livro emprestado");
		}
	}
	
	public void devolver() {
		if(!emprestado) {
			System.out.println("Livro disponível");
		}else {
			emprestado = false;
			System.out.println("Devolução realizada");
		}
	}
	
}
