package pkg;

public class PessoaExecutavel {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		p1.nome = "Maria";
		p1.idade = "20";
		p1.genero = "Feminino";
		
		System.out.println("Características da Pessoa");
		System.out.println("Nome: " + p1.nome);
		System.out.println("Idade: " + p1.idade);
		System.out.println("Genêro: " + p1.genero);

	}

}
