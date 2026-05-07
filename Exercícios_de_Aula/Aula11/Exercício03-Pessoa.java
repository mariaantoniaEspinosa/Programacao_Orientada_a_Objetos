package pacote3;

public class Pessoa {
	public void falar(String mensagem) {
		System.out.println(mensagem);
	}
	
	public void falar(String mensagem, int repeticao) {
		for(int i = 1; i<=repeticao; i++) {
			System.out.println(mensagem);
		}
	}
}
