package pkg;

import java.util.Scanner;

public class Exercício02 {

	public static void main(String[] args) {
		
		float odometrodia;
		float odometronoite;
		float litrosgastos;
		float valorrecebido;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a sua quilometragem inicial: ");
		odometrodia = teclado.nextFloat();
		
		System.out.println("Digite sua quilometragem final: ");
		odometronoite = teclado.nextFloat();
		
		System.out.println("Digite quantos litros de gasolina foram gastos: ");
		litrosgastos = teclado.nextFloat();
		
		System.out.println("Digite o valor total recebido no dia: ");
		valorrecebido = teclado.nextFloat();
		
		float totalkm;
		float mediaconsumo;
		float lucrodia;
		
		totalkm = odometronoite - odometrodia;
		mediaconsumo = totalkm/litrosgastos;
		lucrodia = valorrecebido - (litrosgastos * 4.90f);
		
		System.out.println("A média consumida foi " + mediaconsumo + " km/l e o lucro foi de " + lucrodia + " reais");
		
		
	}

}
