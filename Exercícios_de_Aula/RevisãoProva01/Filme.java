package pkg;

public class Filme {
	public String titulo;
	public String diretor;
	public int duracaoEmMinutos;
	public String genero;
	
	public Filme (String titulo, String diretor, int duracaoEmMinutos, String genero) {
		this.titulo = titulo;
		this.diretor = diretor;
		this.duracaoEmMinutos = duracaoEmMinutos;
		this.genero = genero;
	}
	
	public void exibirDetalhes() {
		System.out.println("Título: " + titulo);
		System.out.println("Diretor: " + diretor);
		System.out.println("Duração em Minutos: " + duracaoEmMinutos);
		System.out.println("Genero: " + genero);
	}
	
	public boolean ehLongo() {
		if (duracaoEmMinutos >= 120) {
			return true;
		} else {
			return false;
		}
	}
}
