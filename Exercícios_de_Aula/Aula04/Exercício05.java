package pkg;

import java.util.Scanner;

public class PrincipalPessoa2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int opcao;
		
		System.out.println("Escolha o construtor: ");
		System.out.println("(1) = Nome e Idade OU (2) = apenas Idade");
		opcao = teclado.nextInt();
		teclado.nextLine();
		
		if (opcao ==1) {
			String nome;
			int idade;
			
			System.out.println("Digite o nome: ");
			nome = teclado.nextLine();
			
			System.out.println("Digite a idade: ");
			idade = teclado.nextInt();
			
			Pessoa2 p = new Pessoa2(nome, idade);
		}
		
		else if(opcao == 2) {
			int idade;
			
			System.out.println("Digite a idade: ");
			idade = teclado.nextInt();
			
			Pessoa2 p = new Pessoa2(idade);
			
		}
		else {
			System.out.println("Opção inválida");
		}
		
		teclado.close();
	

	}

}
