package pkg;

public class Aluno {
	String nome;
	int nota1, nota2, nota3;
	
	public Aluno(String nome, int nota3, int nota2, int nota1) {
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}
	
	public float calcularMedia() {
		return (nota1 + nota2 + nota3) / 3.0f;
	}
	
	public boolean aprovado() {
		return calcularMedia() >= 7;
	}
	
	public int maiorNota() {
		int maior = nota1;
		
		if(nota2 > maior) {
			maior = nota2;
		}
		
		if(nota3> maior) {
			maior = nota3;
		}
		
		return maior;
		
	}
	
	public int menorNota() {
		int menor = nota1;
		
		if(nota2 < menor) {
			menor = nota2;
		}
		
		if(nota3 < menor) {
			menor = nota3;
		}
		
		return menor;
		
	}
	
	
}
