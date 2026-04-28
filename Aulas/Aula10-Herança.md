# Herança
- reutilização de software
- alterações em cascata
- *extends*
- Java não permite herança múltipla: uma classe não herda de duas classes
- É permitido somente: classe 2 extends classe 1 e classe 3 extends classe 2
## Exemplo
- classe Carro
```
package pacote;

public class Carro {
	protected String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void exibeMsg() {
		System.out.println("Estou na classe Carro");
		System.out.println("O carro é: " + nome); //pode usar this.nome
	}
	
	
	
}
```
- classe Onibus que herda da classe Carro
```
package pacote;

public class Onibus extends Carro{
	
	private String modelo;

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	@Override
	public void exibeMsg() {
		System.out.println("Estou na classe Onibus");
		System.out.println("O onibus é: " + nome);
		System.out.println("O modelo do onibus é: " + modelo);
	}
	
	
}

```
- classe Principal
```
package pacote;

public class Principal {

	public static void main(String[] args) {
		Carro c = new Carro();
		c.nome = "Fusca";
		c.exibeMsg();
		
		Onibus o = new Onibus();
		o.nome = "Marcopolo";
		o.setModelo("OM-1519");
		o.exibeMsg();

	}

}

```
## Jogo rápido [1]
- Crie uma classe Animal com os seguintes atributos: nome, idade e som. Em seguida, crie uma classe Cachorro qu herda de Animal e adiciona um atributo raça. Crie um método na classe Cachorro chamado latir() que exibe o som do cachorro.
*pegar desenvolvimento dos slides

- Classe Animal
```
package pacote2;

public class Animal {
	private String nome;
	private int idade;
	protected String som;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSom() {
		return som;
	}
	public void setSom(String som) {
		this.som = som;
	}
	
}
```

- Classe Cachorro
```
package pacote2;

public class Cachorro extends Animal {
	private String raca;

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	public void latir() {
		System.out.println(som);
	}
}
```

- Classe Principal
```
package pacote2;

public class Principal {

	public static void main(String[] args) {
		Cachorro c = new Cachorro();
		c.setNome("Amarelo");
		c.setIdade(10);
		c.setSom("Au-au");
		c.setRaca("Vira-Lata");
		c.latir();

	}

}

```
# Lidando com Construtor
* pegar exemplo dos slides 
```
// Superclasse (Classe Pai)
class Animal {
    String nome;

    // Construtor da Superclasse
    public Animal(String nome) {
        this.nome = nome;
    }
}

// Subclasse (Classe Filha)
class Cachorro extends Animal {
    String raca;

    // Construtor da Subclasse
    public Cachorro(String nome, String raca) {
        // Chamada ao construtor da superclasse é obrigatória
        super(nome); 
        this.raca = raca;
    }
}

```

# Herança Múltipla 
- Classe 1
```
package pacote4;

public class Desenho {
	protected String nomeAutor;

	public String getNomeAutor() {
		return nomeAutor;
	}

	public void setNomeAutor(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}
	
	
}

```

- Classe 2
```
package pacote4;

public class Desenho2D extends Desenho {
	protected int largura;
	protected int altura;
	
	public Desenho2D(int largura, int altura) {
		super();
		this.largura = largura;
		this.altura = altura;
	}
	
}

```

- Classe 3
```
package pacote4;

public class Quadrado extends Desenho2D {
	protected String desc;

	public Quadrado(int largura, int altura, String desc) {
		super(largura, altura);
		this.desc = desc;
	}
	
	public void exibeDados() {
		System.out.println("Largura: " + this.largura); //desenho2D
		System.out.println("Altura: " + this.altura); //desenho2D
		System.out.println("Descrição: " + this.desc); //Quadrado
		System.out.println("Autor: " + this.getNomeAutor()); //Desenho
	}
}
```

- Main
```
package pacote4;

public class Main {

	public static void main(String[] args) {
		Quadrado q = new Quadrado(100, 150, "Quadrado da Maria");
		q.setNomeAutor("Maria Antonia");
		q.exibeDados();

	}

}
```
