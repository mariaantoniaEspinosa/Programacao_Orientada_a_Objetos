# Classes abstratas
- Classe que não pode ser instanciada = não é possível criar objetos a partir dela.
- Projetada para ser **estendida** por outras classes que podem ser instanciadas.
- Defini-se métodos abstratos dentro da classe abstrata.
  - método abstrato: sem implementação; deve ser implementado por qualquer classe que estenda a classe abstrata.
- *abstract* antes da palavra *class*.
- definem uma interface comum ...(resto no slide)
## Exemplo 
- Classe Animal
```
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
```
- Classe Cachorro
```
package pkg;

public class Cachorro extends Animal{

	@Override //sobrescrevendo 
	public void emiteSom() {
		System.out.println("au au au");
	}
	
}

```
- Classe Tigre
```
package pkg;

public class Tigre extends Animal {

	@Override
	public void emiteSom() {
		System.out.println("grooow");
	}

}
```
- Classe Principal
```
package pkg;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		//ERRADO: Animal a = new Animal();
		
		Cachorro c = new Cachorro();
		c.emiteSom();
		
		Tigre t = new Tigre();
		t.emiteSom();
		
		Scanner teclado = new Scanner(System.in);
		Animal a;
		int op;
		
		System.out.println("Digite 1 para instanciar um cachorro ou 2 para instanciar um tigre: ");
		op = teclado.nextInt();
		
		if(op == 1) {
			a = new Cachorro();
			a.especie = "Labrador";
			a.idade = 10;
		} else {
			a = new Tigre();
			a.especie = "Tigrão";
			a.idade = 8;
		}
		a.emiteSom();
		a.exibeInfo();
	}
}

```
# Interfaces
