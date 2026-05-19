package pacote1;

public class Main {
	public static void main(String[] args) {
		Notebook note = new Notebook("Dell", "V15");
		Netbook net = new Netbook ("Asus", "V14");
		
		System.out.println("Notebook: " + note.exibeModelo());
		System.out.println("Marca: " + note.marca);
		
		System.out.println("Netbook: " + net.exibeModelo());
		System.out.println("Marca: " + net.marca);
	}
}
