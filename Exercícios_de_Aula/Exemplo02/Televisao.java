package pkg;

public class Televisao implements Controlavel{
	public String canal;
	
	public void ligar() {
		System.out.println("Ligando TV...");
		System.out.println("TV ligada no canal: " + canal);
	}
	
	public void desligar() {
		System.out.println("Desligando TV...");
	}
}
