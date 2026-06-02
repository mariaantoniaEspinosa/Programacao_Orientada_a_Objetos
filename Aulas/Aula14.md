# Classes abstratas
- Classe que não pode ser instanciada = não é possível criar objetos a partir dela.
- Projetada para ser **estendida** por outras classes que podem ser instanciadas.
- Defini-se métodos abstratos dentro da classe abstrata.
  - método abstrato: sem implementação; deve ser implementado por qualquer classe que estenda a classe abstrata.
- *abstract* antes da palavra *class*.
- definem uma interface comum ...(resto no slide)
## Exemplo 01 
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
## Exemplo 02
- Classe Forma
```
package pkg2;

public abstract class Forma {
	public abstract double area();
	public abstract double perimetro();
}

```
- Classe Retangulo
```
package pkg2;

public class Retangulo extends Forma {

	public double largura;
	public double altura;
	
	public Retangulo(double largura, double altura) {
		super();
		this.largura = largura;
		this.altura = altura;
	}

	@Override
	public double area() {
		return largura * altura;
	}

	@Override
	public double perimetro() {
		return 2 * (largura * altura);
	}

}
```
- Classe Circulo
```
package pkg2;

public class Circulo extends Forma {

	public double raio;
	
	
	public Circulo(double raio) {
		super();
		this.raio = raio;
	}

	@Override
	public double area() {
		return Math.PI * Math.pow(raio, 2);
	}

	@Override
	public double perimetro() {
		return 2 * Math.PI * raio;
	}

}

```
- Clase Principal
```
package pkg2;

public class principal {
	public static void main(String[] args) {
		Circulo c = new Circulo(3.4);
		
		System.out.println("CIRCULO");
		System.out.println("Area do circulo: " + c.area());
		System.out.println("Perimetro do circulo: " + c.perimetro());
		
		Retangulo r = new Retangulo (3.7, 8.3);
		System.out.println("RETANGULO");
		System.out.println("Area do retangulo: " + r.area());
		System.out.println("Perimetro do retangulo: " + r.perimetro());
	}
}

```

# Interfaces
