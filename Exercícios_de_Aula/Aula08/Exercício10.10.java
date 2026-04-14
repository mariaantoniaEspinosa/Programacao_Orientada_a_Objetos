package pkg;

public class Tarefa {
	public String descricao;
	public boolean concluida;
	
	public boolean concluirTarefa() {
		if(concluida == true) {
			return false;
		} else {
			concluida = true;
			return true;
		}
	}
	
	public void exibirTarefa() {
		System.out.println("Descrição da tarefa: " + descricao);
		System.out.println("Está concluida? " + concluida);
	}
}
