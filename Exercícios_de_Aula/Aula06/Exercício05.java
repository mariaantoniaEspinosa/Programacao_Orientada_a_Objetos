package pkg;

public class PrincipalCarro {

	public static void main(String[] args) {
		Carro c = new Carro("Honda", 80, 200);
		
		System.out.println("Velocidade atual do " + c.modelo + ": " + c.velocidadeAtual);
		c.acelerar(20);
		System.out.println("Velocidade depois de acelerar: " + c.velocidadeAtual);
		c.frear(20);
		System.out.println("Velocidade depois de frear: " + c.velocidadeAtual);
		System.out.println("A velocidade máxima do carro é: " + c.velocidadeMaxima);
		System.out.println("Tempo de viagem estimado: " + c.calcularTempoViagem(100) + "km/h");

	}

}
