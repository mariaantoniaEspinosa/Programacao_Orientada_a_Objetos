package pkg;

import java.util.Scanner;

public class MainTarefa {

	public static void main(String[] args) {
		Tarefa [] t = new Tarefa[3];
		Scanner teclado = new Scanner(System.in);
		
		int i, escolha;
		
		for(i = 0; i < t.length; i++) {
			t[i] = new Tarefa();
			
			System.out.println("Digite a descrição da tarefa: ");
			t[i].descricao = teclado.nextLine();
			
			t[i].concluida = false;
		}
		
		System.out.println("Qual tarefa deseja concluir? 0 - 2: ");
		escolha = teclado.nextInt();
		
		if(escolha >= 0 && escolha < 3) {
			t[escolha].concluirTarefa();
		}else {
			System.out.println("Opção inválida");
		}
		
		for(i = 0; i < t.length; i++) {
			System.out.println("Tarefa: " + i);
			t[i].exibirTarefas();
		}
	}	
}
