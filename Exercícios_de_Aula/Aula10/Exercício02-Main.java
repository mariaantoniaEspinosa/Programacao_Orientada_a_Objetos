package pacote2;

public class Main {

	public static void main(String[] args) {
		Pessoa p = new Pessoa("Maria");
		Funcionario f = new Funcionario("Mariazinha");
		
		System.out.println("Nome da pessoa: " + p.nome);
		p.trabalhar();
		
		System.out.println("Nome do funcionario: " + f.nome);
		f.trabalhar();

	}

}
