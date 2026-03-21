package pkg;

public class Pessoa {
	public String nome;
	public String email;
	public String dataNascimento;
	public String endereco;
	public boolean adm;
	
	public void cadastro(String n, String e, String d, String end) {
		nome = n;
		email = e;
		dataNascimento = d;
		endereco = end;
		adm = false;
	}
	
	public String mostrarEmail() {
		return email;
	}
	
	public void promoverAdm() {
		adm = true;
	}
	
	public void mostrar() {
		System.out.println("Nome: " + nome);
		System.out.println("Email: " + email);
		System.out.println("Data de Nascimento: " + dataNascimento);
		System.out.println("Endereço: " + endereco);
		System.out.println("Adm: " + adm);
		
	}

}
