package pkg;

import java.util.Scanner;

public class PrincipalTarefa {

	public static void main(String[] args) {
		Tarefa[ ] t = new Tarefa[3];
		Scanner teclado = new Scanner(System.in);
		
		for(int i = 0; i < t.length; i++) {
			t[i] = new Tarefa();
			
			System.out.println("Digite a descrição da tarefa: ");
			t[i].descricao = teclado.nextLine();
			
			t[i].concluida = false;
		}
		
		System.out.println("Qual tarefa deseja marcar como concluída? (0 a 2)");
		int escolha = teclado.nextInt();
		
		if(escolha >= 0 && escolha < 3) {
			t[escolha].concluirTarefa();
		} else {
			System.out.println("Opção inválida!");
		}
		
		
		for(int i = 0; i < t.length; i++) {
			System.out.println("\nTarefa " + (i + 1));
			t[i].exibirTarefa();
		}
	}

}
