package pacote;

public class Reserva {
	protected String nomeCliente;
	protected int numeroQuarto;
	protected double valorDiaria;
	protected boolean statusReserva;
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		if(!nomeCliente.isEmpty() && !nomeCliente.isBlank()) {
			this.nomeCliente = nomeCliente;	
		}		
	}
	public int getNumeroQuarto() {
		return numeroQuarto;
	}
	public void setNumeroQuarto(int numeroQuarto) {
		if(numeroQuarto > 0) {
			this.numeroQuarto = numeroQuarto;	
		}	
	}
	public double getValorDiaria() {
		return valorDiaria;
	}
	public void setValorDiaria(double valorDiaria) {
		if(valorDiaria >= 0) {
			this.valorDiaria = valorDiaria;	
		}
	}
	public boolean isStatusReserva() {
		return statusReserva;
	}
	public void setStatusReserva(boolean statusReserva) {
		this.statusReserva = statusReserva;
	}
	public void realizarReserva() {
		this.setStatusReserva(true);
		System.out.println("Reserva efetuada!");
		
	}
	public void cancelarReserva() {
		this.setStatusReserva(false);
		System.out.println("Reserva cancelada!");
	}
}
