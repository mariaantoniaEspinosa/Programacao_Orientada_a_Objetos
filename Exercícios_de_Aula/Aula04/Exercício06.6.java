package pkg;

public class Aluno {
	 	public String nome;
	    public String matricula;
	    public String dataNascimento;
	    public int anoIngresso;

	    public Aluno(String n, String m) {
	        nome = n;
	        matricula = m;

	        System.out.println("Construtor 1: nome e matrícula");
	        System.out.println("Nome: " + nome);
	        System.out.println("Matrícula: " + matricula);
	    }

	    public Aluno(String data) {
	        dataNascimento = data;

	        System.out.println("Construtor 2: data de nascimento");
	        System.out.println("Data de nascimento: " + dataNascimento);
	    }

	   
	    public Aluno(String n, String data, int ano) {
	        nome = n;
	        dataNascimento = data;
	        anoIngresso = ano;

	        System.out.println("Construtor 3: completo");
	        System.out.println("Nome: " + nome);
	        System.out.println("Data de nascimento: " + dataNascimento);
	        System.out.println("Ano de ingresso: " + anoIngresso);
	    }
}
