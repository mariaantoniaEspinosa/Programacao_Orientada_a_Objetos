package pacote;

import java.util.ArrayList;
import java.util.List;

public class Principal {
	public static void main(String[] args) {
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		Pessoa p1 = new Pessoa("Maria", 20, "Feminino");
		Pessoa p2 = new Pessoa("Mariazinha", 15, "Feminino");
		Pessoa p3 = new Pessoa("Joao", 34, "Masculino");
		
		pessoas.add(p3);
		pessoas.add(p2);
		pessoas.add(p1);
		
		quantidadeMulheres(pessoas);
	}
	
	public static void quantidadeMulheres(List<Pessoa> pessoas) {
		int i = 0;
		for (Pessoa p : pessoas) {
			if(p.getSexo().equals("Feminino")){
				i++;
			}
		}
		System.out.println("A quantidade de mulheres é: " + i);
	}
}
