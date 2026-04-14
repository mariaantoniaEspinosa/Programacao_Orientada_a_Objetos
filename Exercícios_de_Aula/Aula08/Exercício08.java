package pkg;

import java.util.Scanner;

public class PrincipalUsuario {

	public static void main(String[] args) {
		Usuario u = new Usuario("Maria", "1234", true);
		Scanner teclado = new Scanner (System.in);
		
		String usuario;
		String senha;
		
		System.out.println("Digite seu nome de usuário: ");
		usuario = teclado.nextLine();
		
		System.out.println("Digite sua senha: ");
		senha = teclado.nextLine();
		
		u.login(usuario, senha);
		u.exibirStatus();

	}

}
