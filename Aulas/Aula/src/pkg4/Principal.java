package pkg4;

public class Principal {
	public static void main(String[] args) {
	
		Smartphone meuSmartphone = new Smartphone("11999999999", "contato@email.com");

		 meuSmartphone.verificaChamada();
		 meuSmartphone.verificaEmail();

		 System.out.println("Telefone: " + meuSmartphone.tel);
		 System.out.println("Email: " + meuSmartphone.email);

	}
}
