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

```

- Classe Cachorro
```

```

- Classe Principal
```

```
# Lidando com Construtor
* pegar exemplo dos slides 
