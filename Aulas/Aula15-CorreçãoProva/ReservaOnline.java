package pacote;

public class ReservaOnline extends Reserva {
	public void realizarReserva(String nome) {
		this.setStatusReserva(true);
		this.setNomeCliente(nome);
		System.out.println("Reserva efetuada por "+nome);
	}
	
	public void realizarReserva(String nome, String cupom) {
		this.setStatusReserva(true);
		this.setNomeCliente(nome);
		System.out.println("Reserva efetuada por "+nome);
		System.out.println("Com cupom desconto "+cupom);
	}
	@Override
	public void cancelarReserva() {
		this.setStatusReserva(false);
		System.out.println("Cancelamento só pode ocorrer até 24 horas antes");
		System.out.println("Cancelamento efetuado!");
	}
}
