package pkg;

public class Cachorro extends Animal{
	
	public String raca;
	
	@Override //sobrescrevendo 
	public void exibeInfo() {
		//OU... super.exibeInfo + sysout(raça)
		System.out.println("Idade: " + idade);
		System.out.println("Espécie: " + especie);
		System.out.println("Raça: " + raca);
	}

	@Override //sobrescrevendo 
	public void emiteSom() {
		System.out.println("au au au");
	}
	
	public void cuidarPatio() {
		System.out.println("Cachorro está cuidando do pátio");
	}
	
}
