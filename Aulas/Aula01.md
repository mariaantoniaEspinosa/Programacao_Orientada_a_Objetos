## Leitura dos slides Aula 01 Java + Revisão Lógica + Condicionais
### Exemplos de código em Java

### 01 
```
  package pkg;
  
  public class Program {

	public static void main(String[] args) {
		System.out.println("Olá mundo");
		int idade;
		idade = 18;
		System.out.println("A idade é: " + idade);
		System.out.println("O indivíduo tem " + idade + " anos");
		
		char c = 'c';
		System.out.println("O char: " +c);
		
		float f = 3.14f;
		System.out.println("O float: " +f);
		
		double d = 3.141516;
		System.out.println("O double: " +d);

	  }
}
```
### 02
```
package pkg;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		String nome;
		int idade;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o nome: ");
		nome = teclado.nextLine();
		
		System.out.println("Nome digitado: " + nome);
		
		System.out.println("Digite sua idade: ");
		idade = teclado.nextInt();
    //ler float = nextFloat();
    //ler double = nextDouble();
		
		System.out.println("Sua idade é: " + idade);
	}
}

```
### 03
```
package pkg;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		String nome;
		int idade;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		idade = teclado.nextInt();
		System.out.println("Sua idade é: " + idade);
		
		if(idade >=18) {
			System.out.println("Maior de idade");
		}else {
			System.out.println("Menor de idade");
		}
	}
}

```
### 04
```
package pkg;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		String nome;
		int idade;
		
		Scanner teclado = new Scanner(System.in);
		
		int opcao;
		System.out.println("Digite uma opção: ");
		System.out.println("Digite 1 para cadastrar");
		System.out.println("Digite 2 para consultar");
		System.out.println("Digite 3 para sair");
		opcao = teclado.nextInt();
		
		switch(opcao) {
		case 1:
			System.out.println("Aqui vai cadastrar");
			break;
		case 2:
			System.out.println("Aqui vai consultar");
			break;
		case 3:
			System.out.println("Aqui vai sair");
			break;
    default:
      System.out.println("Digite uma operação válida");
      break:
		}
	}
}

```
