package pacote8;

public class Main {
	public static void main(String[] args) {
		
		//polimorfismo 
		
		Reserva hotel = new ReservaDeHotel();
		Reserva voo = new ReservaVoo();
		
		
		hotel.adicionar();
		hotel.cancelar();
		
		voo.adicionar();
		voo.cancelar();
		
		//sobrecarga
		
		ReservaVoo r = new ReservaVoo();
		
		r.adicionar("Economica");
		r.cancelar("Tempo ruim");
		
		ReservaDeHotel rH = new ReservaDeHotel();
		
		rH.adicionar("Morotim");
		rH.cancelar("Hotel lotado");
	}
}
