package pkg;

import java.util.Scanner;

public class PrincipalPessoa {

	public static void main(String[] args) {
		Pessoa p = new Pessoa("Maria", 20, "04776751070");
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		p.setNome(teclado.nextLine());
		
		System.out.println("Digite o cpf: ");
		p.setCpf(teclado.nextLine());
		
		System.out.println("Digite a idade: ");
		p.setIdade(teclado.nextInt());
		
		
		System.out.println("Nome: " + p.getNome());
		System.out.println("CPF: " + p.getCpf());
		System.out.println("Idade: " + p.getIdade());
		
		if(p.verificarMaiorDeIdade()) {
			System.out.println("Maior de idade");
		} else {
			System.out.println("Menor de idade");
		}

	}

}
