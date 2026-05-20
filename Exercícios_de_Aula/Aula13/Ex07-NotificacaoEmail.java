package pacote7;

public class NotificacaoEmail extends Notificacao {
	
	public void enviar() {
		System.out.println("Enviada notificação");
	}
	
	public void enviar(String dest) {
		System.out.println("Enviado para: " + dest);
	}
	
	public void enviar(String dest, String dest2) {
		System.out.println("Enviado para: " + dest + " e " + dest2) ;
	}
}
