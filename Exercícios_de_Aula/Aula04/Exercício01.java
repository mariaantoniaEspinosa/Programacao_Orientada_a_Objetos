package pkg;

import java.util.Scanner;

public class PrincipalDisciplina {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		Disciplina d = new Disciplina();
		
		d.atribuir("Matematica", 20, "Alexandre");
		
		System.out.println("Dados da disciplina antiga: ");
		d.mostrar();
		
		System.out.println("Preencha os dados da nova disciplina! ");
		
		String nome, professor;
		int carga;
		
		System.out.println("Nome: ");
		nome = teclado.nextLine();
		
		System.out.println("Carga horaria: ");
		carga = teclado.nextInt();
		
		teclado.nextLine();
		
		System.out.println("Professor: ");
		professor = teclado.nextLine();
		
		d.atribuir(nome, carga, professor);
		
		System.out.println("Dados da disciplina nova: ");
		d.mostrar();
		
		teclado.close();

	}

}
