package pkg;

public class PrincipalAluno {

	public static void main(String[] args) {
		Aluno a = new Aluno("Maria", 10, 7, 6);
		
		System.out.println("Aluno: " + a.nome);
		System.out.println("Média de notas: " + a.calcularMedia());
		System.out.println("Maior nota: " + a.maiorNota());
		System.out.println("Menor nota: " + a.menorNota());
		System.out.println("Aprovado: " + a.aprovado());

	}

}
