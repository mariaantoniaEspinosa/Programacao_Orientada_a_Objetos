package pkg;

public class Livro {
	public String titulo, autor;
	public int paginas;
	public boolean emprestado;
	
	public Livro(String t, String a, int p, boolean e) {
		titulo = t;
		autor = a;
		paginas = p;
		emprestado = e;
	}
	
	public boolean emprestar() {
		if(emprestado ==  false) {
			emprestado = true;
			return true;
		} else {
			return false;
		}
	}
	
	public void devolver() {
		emprestado = false;
	}
	
	public boolean estaDisponivel() {
		if(emprestado == false) {
			return true;
		} else {
			return false;
		}
	}
	
	public String detalhesLivro() {
		return "Título: " + titulo + "\nAutor: " + autor + "\nPáginas: " + paginas + "\nDisponível: " + estaDisponivel();
	}
}
