package ufn;

import java.util.ArrayList;
import java.util.List;

public class PrincipalAlunos {

	public static void main(String[] args) {
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		Aluno a1 = new Aluno (10, 9, "Maria");
		Aluno a2 = new Aluno (7, 2, "Julia");
		Aluno a3 = new Aluno (10, 9, "Ste");
		
		alunos.add(a1);
		alunos.add(a2);
		alunos.add(a3);
		
		MediaNotas(alunos);
	
	}
	
	public static void MediaNotas(List<Aluno> notas) {
		for(Aluno a : notas) {
			double media;
			media =(a.getNota1() + a.getNota2()) / 2;
			System.out.println(a.getNome());
			System.out.println("Média:" + media );
			if(media >= 6) {
				System.out.println("Aprovado");
			} else {
				System.out.println("Reprovado");
			}		
		}
	}
}
