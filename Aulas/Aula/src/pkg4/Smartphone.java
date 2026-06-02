package pkg4;

public class Smartphone implements Celular, PC{

	String tel;
	String email;
	
	public Smartphone(String tel, String email) {
		super();
		this.tel = tel;
		this.email = email;
	}

	@Override
	public void verificaEmail() {
		System.out.println("Verificando emails");
		
	}

	@Override
	public void verificaChamada() {
		System.out.println("Realizando chamada");
		
	}

}
