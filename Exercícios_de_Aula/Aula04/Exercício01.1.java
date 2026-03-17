package pkg;

public class Disciplina {
	public String nome;
	public int cargahoraria;
	public String nomeprofessor;
	
	public void atribuir(String n, int ch, String p) {
		nome=n;
		cargahoraria=ch;
		nomeprofessor=p;
	}
	
	public void mostrar() {
		System.out.println("Nome: " + nome);
		System.out.println("Carha horaria: " + cargahoraria + " horas");
		System.out.println("Professor: " + nomeprofessor);
		
	}
}
