## Correção da prova I
- Classe Aluno
```
package pkg;

public class Aluno {
	private String nome;
	private double nota;
	
	public Aluno (String nome, double nota) {
		this.nome = nome;
		this.nota = nota;
	}
	
	//retorna valores
	public String getNome() {
		return nome;
	}
	
	//seta 
	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}
	
	public String aprovado() {
		if(nota>=7) {
			return "Aprovado";
		}
		return "Reprovado";
	}
	
	public void exibeInformacoes() {
		System.out.println("Nome: " + nome);
		System.out.println("Nota: " + nota);
		System.out.println("Status: " + this.aprovado());
	}
}
```

- Principal
  
```
REFAZER 
```
# Polimorfismo
- muitas formas
- "programar no geral"
- Sobrescrita de métodos:
  - mesmo none, mesmo parametros e mesmo tipo de retorno, só muda a implementação (override)
- Sobrecarga de métodos:
  - mesmo nome, parametros diferentes e tipos de retornos diferentes (overload)
### Exemplo 1 - sobrecrita
- Classe Animal
```
package pkg;

public class Animal {
	public void fazerSom() {
		System.out.println("O animal esta fazendo som!");
	}
}

```
- Classe Cachorro
```
package pkg;

public class Cachorro extends Animal {
	@Override // só para identificar

	//método sobrescrito

	public void fazerSom() {
		System.out.println("au au");
	}
}
```
- Classe Principal
```
package pkg;

public class Principal {

	public static void main(String[] args) {
		
		
		System.out.println("Animal: ");
		Animal a = new Animal();
		a.fazerSom();
		
		
		System.out.println("Cachorro: ");
		Cachorro c = new Cachorro();
		c.fazerSom();
		
		
		//a = new Cachorro();
		//a.fazerSom();

	}
}
```
### Exemplo 2 - sobrescrita
- Classe Pessoa
```
package pkg2;

public class Pessoa {
	public void trabalhar() {
		System.out.println("Trabalhando");
	}
}

```
- Classe Programador
```
package pkg2;

public class Programador extends Pessoa{
	public void trabalhar() {
		System.out.println("Programando");
	}
}
```
- Classe Principal
```
package pkg2;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		/*System.out.println("Pessoa: ");
		Pessoa p = new Pessoa();
		p.trabalhar();
		
		System.out.println("Programador: ");
		Programador pg = new Programador();
		pg.trabalhar();*/
		
		Pessoa pessoa;
		System.out.println("Digite 1 para pessoa");
		System.out.println("Digite 2 para programador");
		Scanner teclado = new Scanner (System.in);
		int op = teclado.nextInt();
		if(op==1) {
			pessoa = new Pessoa();
			pessoa.trabalhar();
		} else if(op==2) {
			pessoa = new Programador();
			pessoa.trabalhar();
		}
	}
}

```
### Exemplo 1 - sobrecarga
- Classe Calculadora 
```
package pkg3;

public class Calculadora {
	public int somar(int x, int y) {
		return x + y;
	}
	
	public int somar(int x, int y, int z) {
		return x + y + z;
	}
	
}
```
- Classe Principal
```
package pkg3;

public class Principal {
	public static void main(String[] args) {
		Calculadora c = new Calculadora();
		int resultado = c.somar(4,  3);
		System.out.println("Soma:  " + resultado);
		resultado = c.somar(4, 7, 9);
		System.out.println("Soma 2: " + resultado);
	}
}

```
