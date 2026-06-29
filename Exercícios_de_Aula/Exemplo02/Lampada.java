package pkg;

public class Lampada implements Controlavel{
	private boolean acesa = false;
	
	public void ligar() {
		acesa = true;
		System.out.println("Ligando lampada");
		System.out.println("Lampada acesa");
	}
	
	public void desligar() {
		acesa = false;
		System.out.println("Desligando lampada");
		System.out.println("Lampada desligada");
	}
}
