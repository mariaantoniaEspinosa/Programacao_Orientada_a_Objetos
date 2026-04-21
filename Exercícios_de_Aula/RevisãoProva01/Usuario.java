package pkg;

public class Usuario {
	public String nomeUsuario;
	public String senha;
	public boolean logado;
	
	public Usuario(String nomeUsuario, String senha, boolean logado) {
		this.nomeUsuario = nomeUsuario;
		this.senha = senha;
		this.logado = logado;
	}

	public void login(String usuario, String senha) {
		if (this.nomeUsuario.equals(usuario) &&  this.senha.equals(senha)) {
			logado = true;
		} else {
			logado = false;
		}
	}
	
	public void logout() {
		if (logado) {
			logado = false;
		}
	}
	
	public void exibirStatus() {
		System.out.println("Usuário logado? " + logado);
	}
}
