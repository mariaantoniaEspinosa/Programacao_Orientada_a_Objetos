package pkg;

import java.util.Scanner;

public class MainUsuario {

	public static void main(String[] args) {
		Usuario u = new Usuario("Maria", "1234", true);
		Scanner teclado = new Scanner(System.in);
		
		String nomeUsuario;
		String senha;
		
		System.out.println("Digite seu usuário: ");
		nomeUsuario = teclado.nextLine();
		
		System.out.println("Digite sua senha: ");
		senha = teclado.nextLine();
		
		
		u.login(nomeUsuario, senha);
	
		u.exibirStatus();
		
	}

}
