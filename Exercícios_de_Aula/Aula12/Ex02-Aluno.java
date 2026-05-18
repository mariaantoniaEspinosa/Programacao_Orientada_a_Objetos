package ufn;

public class Aluno {
	protected int nota1;
	protected int nota2;
	protected String nome;
	
	public Aluno(int nota1, int nota2, String nome) {
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nome = nome;
	}
	
	public int getNota1() {
		return nota1;
	}
	public void setNota1(int nota1) {
		this.nota1 = nota1;
	}
	public int getNota2() {
		return nota2;
	}
	public void setNota2(int nota2) {
		this.nota2 = nota2;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
