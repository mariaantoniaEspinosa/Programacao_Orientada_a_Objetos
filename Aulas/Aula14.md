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
- Classe Principal
```
package pkg;

public class Principal {
	public static void main(String[] args) {
		//ERRADO: Animal a = new Animal();
		
		Cachorro c = new Cachorro();
		c.emiteSom();
	}
}

```
# Interfaces
