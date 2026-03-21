package pkg;

import java.util.Scanner;

public class PrincipalPessoa {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		
		String nome, email, dataNascimento, endereco;
		int adm;
		
		System.out.println("Pessoa 1");
		
		System.out.println("Nome: ");
		nome = teclado.nextLine();
		
		System.out.println("Email: ");
		email = teclado.nextLine();
		
		System.out.println("Data de Nascimento: ");
		dataNascimento = teclado.nextLine();
		
		System.out.println("Endereço: " );
		endereco = teclado.nextLine();
		
		p1.cadastro(nome, email, dataNascimento, endereco);
		
		System.out.println("Pessoa 2");
		
		System.out.println("Nome: ");
		nome = teclado.nextLine();
		
		System.out.println("Email: ");
		email = teclado.nextLine();
		
		System.out.println("Data de Nascimento: ");
		dataNascimento = teclado.nextLine();
		
		System.out.println("Endereço: " );
		endereco = teclado.nextLine();
		
		p2.cadastro(nome, email, dataNascimento, endereco);
		
		System.out.println("Escolha o administrador, 1 ou 2?");
		adm = teclado.nextInt();
		
		if (adm == 1) {
			p1.promoverAdm();
		} else {
			p2.promoverAdm();
		}
		
		System.out.println("Dados Pessoas");
		
		p1.mostrar();
		p2.mostrar();
		
		teclado.close();
	}

}
