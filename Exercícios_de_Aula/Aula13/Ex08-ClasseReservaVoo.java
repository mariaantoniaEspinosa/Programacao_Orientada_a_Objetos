package pacote8;

public class ReservaVoo extends Reserva{
	
	@Override
	public void cancelar() {
		System.out.println("Reserva de voo cancelada.");
	}
	
	//sobrecarga
	
	public void adicionar(String classe) {
		System.out.println("Sua reserva de voo será na classe: " + classe);
	}
	public void cancelar(String motivo) {
		System.out.println("Seu voo foi cancelado por motivos de: " + motivo);
	}
}
