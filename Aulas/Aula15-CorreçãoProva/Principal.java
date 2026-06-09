package pacote;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		ArrayList<Reserva> reservas = new ArrayList<>();
		Reserva r1 = new Reserva();
		r1.setNomeCliente("Ricardo");
		r1.setNumeroQuarto(1);
		r1.setValorDiaria(244.33);
		r1.realizarReserva();
		reservas.add(r1);
		ReservaOnline r2 = new ReservaOnline();
		r2.setNomeCliente("Roger");
		r2.setNumeroQuarto(2);
		r2.setValorDiaria(440.33);
		r2.realizarReserva();
		r2.realizarReserva("Robson");
		r2.realizarReserva("Roger", "MESEGUE10%");
		reservas.add(r2);
		ReservaPresencial r3 = new ReservaPresencial();
		r3.setNomeCliente("Raquel");
		r3.setNumeroQuarto(4);
		r3.setValorDiaria(1244.89);
		r3.realizarReserva();
		reservas.add(r3);
		
		for(Reserva r : reservas) {
			System.out.println("Reserva: "+r.getNomeCliente());
			System.out.println("Quantidade de quartos: "+r.getNumeroQuarto());
			System.out.println("Valor: "+r.getValorDiaria());
			r.cancelarReserva();
		}
	}

}
