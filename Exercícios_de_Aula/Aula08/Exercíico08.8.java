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
	
	public boolean login(String usuario, String Senha) {
		if(nomeUsuario.equals(usuario) && senha.equals(Senha)) {
			return logado = true;
		} else{
			return logado = false;
		}
	}
	
	public void exibirStatus() {
		System.out.println("usuário logado? " + logado);
	}
}
