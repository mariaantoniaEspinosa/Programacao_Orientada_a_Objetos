package pacote;

public class ReservaPresencial extends Reserva{
	@Override
	public void cancelarReserva() {
		this.setStatusReserva(false);
		System.out.println("Cancelamento pode ser efetuado diretamente na recepção");
		System.out.println("Cancelamento efetuado!");
	}
}
