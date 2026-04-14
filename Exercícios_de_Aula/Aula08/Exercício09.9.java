package pkg;

public class Filme {
	public String titulo;
	public String diretor;
	public int duracaoEmMinutos;
	public String genero;
	
	
	public void exibirDetalhes() {
		System.out.println("Título: " + titulo);
		System.out.println("Diretor: " + diretor);
		System.out.println("Duração em minutos do filme: " + duracaoEmMinutos);
		System.out.println("Genero do Filme: " + genero);
	}
	
	public boolean ehLongo() {
		if (duracaoEmMinutos > 120) {
			return true;
		} else {
			return false;
		}
	}
	
	
}
