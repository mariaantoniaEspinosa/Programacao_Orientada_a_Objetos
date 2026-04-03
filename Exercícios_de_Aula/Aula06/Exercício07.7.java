package pkg;

public class Filme {
	public String titulo;
	public int duracao;
	public int classificacaoEtaria;
	
	public Filme(String t, int d, int c) {
		titulo = t;
		duracao = d;
		classificacaoEtaria = c;
	}
	
	public int converterDuracaoHoras() {
		return duracao / 60;
	}
	
	public boolean podeAssistir(int idade) {
		
		if(idade>=classificacaoEtaria) {
			return true;
		} else {
			return false;
		}
	}
	
	public String descricaoFilme() {
		return "\nTitulo: " + titulo + "\nDuraçao: " + duracao + " minutos " + "\nClassificação Etária: " + classificacaoEtaria + " anos";
	}
}
