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
- contrato que define um conjunto de métodos que uma classe deve implementar
- palavra-chave *interface*, *implements*
- diferentes classes podem implementar seus comportamentos para métodos definidos em comum
- padrão: *public*, *abstract* -> são mpetodos abstratos e públicos
- implicitamente definidos
- sem modificador de acesso
- deve implementar todos os métodos!
- assinaturas dos métodos
- declarar atributo somente como *constance* (não aconselhado)

## Exemplo 01
- Classe Animal 
```
package pkg3;

public interface Animal {
	// não usamos MODIFICADORES (public...)
	void emitirSom();
	void exibirInfo();
	boolean verificarVacinacao();
}

```
- Classe Cachorro
```
package pkg3;

public class Cachorro implements Animal {

	public String nome;
	public String raca; 
	public int idade;
	
	@Override
	public void exibirInfo() {
		System.out.println("CACHORRO ");
		System.out.println("Nome: " + nome);
		System.out.println("raça: " + raca);
		System.out.println("Idade: " + idade);
	}
	
	@Override
	public void emitirSom() {
		System.out.println("au au");
	}

	@Override
	public boolean verificarVacinacao() {
		System.out.println("Verificando vacinação do cachorro...");
		return false;
	}

}

```
- Classe Gato
```
package pkg3;

public class Gato implements Animal{
	
	@Override
	public void exibirInfo() {
		System.out.println("CLASSE GATO");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("miau!");
	}

	@Override
	public boolean verificarVacinacao() {
		System.out.println("Verificando vacinação do gato...");
		return true;
	}

}

```
- Classe Principal
```
package pkg3;

public class Principal {

	public static void main(String[] args) {
		Cachorro c = new Cachorro();
		c.nome = "Caramelo";
		c.idade = 3;
		c.raca = "SRD";
		c.exibirInfo();
		c.emitirSom();
		System.out.println(c.verificarVacinacao());
		
		Gato g = new Gato();
		g.exibirInfo();
		g.emitirSom();
		System.out.println(g.verificarVacinacao());
	}

}
```
# Diferenças Classe Abstrata X Interfaces
- classe abstrata:
  - tem métodos não abstratos e abstratos
  - pode ter construtores
  - diferentes níveis de visibilidade
  - criada quando se deseja criar uma classe base com algumas implementações e comportamentos já definidos
- interface:
  - só tem método abstratos
  - não pode ter construturores
  - somente atributos *public* e *static*
  - mais restritiva
  - conjunto de declaração de métodos sem implementações
