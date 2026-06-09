## Correção da Prova II
- Teórica: 4.5
- Prática: 4.0
## Exercícios Classes Abstratas e Interfaces
# Exceções
- Classe MinhaExceção
```
package pacote;

public class MinhaExcecao extends Exception {
	public MinhaExcecao() {
		super();
	}
	public MinhaExcecao(String message) {
		super(message);
	}
}

```
- Classe Principal
```
package pacote;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) throws MinhaExcecao{
		Scanner sc = new Scanner(System.in);
		double n1, n2;
		System.out.println("Digite dois numeros: ");
		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
		divide(n1, n2);
	}
	
	public static void divide(double n1, double n2) throws MinhaExcecao {
		if(n2 == 0) {
			throw new MinhaExcecao("Impossivel realizar divisão por 0");
		}
		else {
			System.out.println("O resultado da divisão é: " + n1/n2);
		}
	}
}
```
