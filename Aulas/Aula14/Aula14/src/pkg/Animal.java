package pkg;

public abstract class Animal {
	
	public abstract void emiteSom();
	
	public String especie;
	public int idade;
	
	public void exibeInfo() {
		System.out.println("Idade: " + idade);
		System.out.println("Espécie: " + especie);
	}
}
