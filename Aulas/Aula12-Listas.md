# Herança e Polimorfismo
- herança, polimorfismo e relacionamento entre classes: prova II 26/05
- Aula de exercícios
#
- Main
```
package pacote01;

public class Principal3 {
	public static void main(String[] args) {
		Endereço end = new Endereço("Andradas", 1614);
		Pessoa p2 = new Pessoa("UFN", 75, end);
		System.out.println("Nome "+ p2.getNome());
		System.out.println("Idade "+ p2.getIdade());
		System.out.println("Endereço  "+ p2.getEndereço());
		System.out.println("Rua "+ p2.getEndereço().getRua());
		System.out.println("Numero "+ p2.getEndereço().getNumero());
	}
}
```
- Classe Endereço
```
package pacote01;

public class Endereço {
	private String rua;
	private int numero;
	
	public Endereço(String rua, int numero) {
		this.rua = rua;
		this.numero = numero;
	}

	public String getRua() {
		return rua;
	}

	public int getNumero() {
		return numero;
	}
	
	@Override
	public String toString() {
		return "Endereço [rua = " + rua + ", numero = " + numero + "]";
	}
	
}

```
- Classe Pessoa
```
package pacote01;

public class Pessoa {
	private String nome;
	private int idade;
	private Endereço endereco;
	
	public Pessoa(String nome, int idade, Endereço endereco) {
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}
	
	public Endereço getEndereço() {
		return endereco;
	}
	
}
```
# Listas
- *List*
- Classes: *ArrayList*, *LinkedList* e *Vector*
- Métodos mais comuns: add, remove, get, set, size...
#
- Main
```
package pacote02;

import java.util.ArrayList;
import java.util.List;

public class Principal {
	public static void main(String[] args) {
		List<Pessoa> listaPessoas = new ArrayList<Pessoa>();
		
		Pessoa p1 = new Pessoa ("Maria", 20);
		Pessoa p2 = new Pessoa ("João", 30);
		Pessoa p3 = new Pessoa ("Ste", 10);
		
		listaPessoas.add(p1);
		listaPessoas.add(p2);
		listaPessoas.add(p3);
		
		//chamando um método e passando a lista como parâmetro 
		exibirPessoas(listaPessoas);
	}
	
	public static void exibirPessoas(List<Pessoa> lista) {
		for(Pessoa p : lista) {
			System.out.println("Nome: " + p.getNome());
			System.out.println("Idade: " + p.getIdade());
		}
	}
}
```
- Classe Pessoa
```
package pacote02;

public class Pessoa {
	private String nome;
	private int idade;
	
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}
	
}
```
