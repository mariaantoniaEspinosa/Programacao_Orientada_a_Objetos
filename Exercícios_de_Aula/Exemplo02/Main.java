package pkg;

public class Main {
	public static void main(String[] args) {
		Televisao tv = new Televisao();
		tv.canal = "12";
		tv.ligar();
		tv.desligar();
		
		Lampada lp = new Lampada();
		lp.ligar();
		lp.desligar();
	}
}
