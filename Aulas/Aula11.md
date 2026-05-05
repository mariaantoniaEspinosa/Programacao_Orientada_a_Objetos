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
### Exemplo
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
