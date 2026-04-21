package pkg;

public class Tarefa {
	public String descricao;
	public boolean concluida;
	
	public Tarefa() {
	}
	
	public void concluirTarefa() {
		concluida = true;
	}
	
	public void exibirTarefas() {
		System.out.println("Tarefa: " + descricao);
		System.out.println("Concluida: " + concluida);
	}
}
