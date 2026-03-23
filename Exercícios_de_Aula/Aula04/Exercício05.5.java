package pkg;

public class Pessoa2 {
	public String nome;
	public int idade;
	
	public Pessoa2 (String n, int i) {
		nome = n;
		idade = i; 
		System.out.println("Construtor *nome e idade* ");
		System.out.println("Nome: "+ nome);
		System.out.println("Idade: "+ idade);
	}
	
	public Pessoa2(int i) {
		idade = i;
		System.out.println("Coonstrutor *idade* ");
		System.out.println("Idade: " + idade);
	}
}
