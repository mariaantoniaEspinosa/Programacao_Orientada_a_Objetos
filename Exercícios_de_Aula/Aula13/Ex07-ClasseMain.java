package pacote7;

public class Main {
	public static void main(String[] args) {
		NotificacaoEmail email = new NotificacaoEmail();
		NotificacaoApp app = new NotificacaoApp();
		
		email.enviar();
		email.enviar("Mariazinha");
		email.enviar("Mariazinha", "Joaozinho");
		
		app.enviar();
	}
}
