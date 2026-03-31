package pkg;

public class Aluno {
	public String nome;
	public float nota1, nota2, nota3;
	
	public Aluno(String n, float n1, float n2, float n3) {
		nome = n;
		nota1 = n1;
		nota2 = n2;
		nota3 = n3;
	}
	
	public float calcularMedia() {
		return ((nota1+nota2+nota3)/3);
	}
	
	public boolean aprovado() {
		if(calcularMedia() >= 7) {
			return true;
		} else {
			return false;
		}
	}
	
	public float maiorNota() {
		float maior = nota1;
		
		if(nota2>maior) {
			maior = nota2;
		}
		
		if(nota3>maior) {
			maior = nota3;
		}
		return maior;
	}
	
	public float menorNota() {
		float menor = nota1;
		
		if(nota2< menor) {
			menor = nota2;
		}
		
		if(nota3<menor) {
			menor = nota3;
		}
		
		return menor;
	}
	
}
