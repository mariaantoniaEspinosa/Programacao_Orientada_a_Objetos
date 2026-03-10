# Conceitos 
- Uma **Classe** é uma estrutura que abstrai um conjunto de objetos com características similares.
- a Classe define o comportamento dos objetos através de métodos e atributos
  - **métodos** = funções na liguaguem estruturada
  - **atributos** = variáveis na linguagem estruturada
- Diagrama de Classes = tem a mesma estrutura no mundo todo
  - em negrito: nome da classa
  - abaixo: nome dos atributos
  - abaixo: nome dos metodos (possíveis parâmtros enviados
- Ideia de reutilização de classe
- **Objeto** é a instância de uma classe
- **Estado** e **Comportamento**
  - Estado é representado por seus atributos
  - Comportamento é representado por seus métodos.
- **Encapsulamento** é o empacotamento dos atributos e métodos numa classe
  - público(+)
  - privado(-)
  - protegido(#)
# O que veremos futuramente
- **Subclasse** é a classe filha que herda os atrubutos e os métodos da classe mãe (herança)
- **Mensagem** é a troca de informação entre objetos
- **Abstração**: classe não instanciável
- **Associação**: utlização de recursos entre objetos
- **Polimorfismo**
- **Linguagem UML**
# Exercício
- Exibir a idade de três alunos com Objetos
```
package pkg;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		int n;
		Scanner teclado = new Scanner(System.in);
		
		
		Aluno a1 = new Aluno();
		System.out.println("Digite o nome do aluno: ");
		a1.nome = teclado.nextLine();
		//a1.nome = "Estevhan";
		System.out.println("Digite a idade do aluno: ");
		a1.idade = teclado.nextInt();
		a1.matricula = "102030";
		a1.cpf = "852.521.240-04";
		teclado.nextLine();
		
		System.out.println("Aluno instanciado");
		System.out.println("Nome: " + a1.nome);
		System.out.println("Idade: " + a1.idade);
		System.out.println("Matricula: " + a1.matricula);
		System.out.println("CPF: " + a1.cpf);
		
		Aluno a2 = new Aluno();
		System.out.println("Digite o nome do aluno: ");
		a2.nome = teclado.nextLine();
		System.out.println("Digite a idade do aluno: ");
		a2.idade = teclado.nextInt();
		a2.matricula = "102030";
		a2.cpf = "852.521.240-04";
		teclado.nextLine();
		
		System.out.println("Aluno instanciado");
		System.out.println("Nome: " + a2.nome);
		System.out.println("Idade: " + a2.idade);
		System.out.println("Matricula: " + a2.matricula);
		System.out.println("CPF: " + a2.cpf);
		
		Aluno a3 = new Aluno();
		System.out.println("Digite o nome do aluno: ");
		a3.nome = teclado.nextLine();
		System.out.println("Digite a idade do aluno: ");
		a3.idade = teclado.nextInt();
		a3.matricula = "102030";
		a3.cpf = "852.521.240-04";
		teclado.nextLine();
		
		System.out.println("Aluno instanciado");
		System.out.println("Nome: " + a3.nome);
		System.out.println("Idade: " + a3.idade);
		System.out.println("Matricula: " + a3.matricula);
		System.out.println("CPF: " + a3.cpf);
		
	}

}

```
  
```
package pkg;

public class Aluno {
	public String nome;
	public String matricula;
	public String cpf;
	public int idade;

}

```
# Correção
```
package pkg;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		int n;
		Scanner teclado = new Scanner(System.in);
		
		
		Aluno a1 = new Aluno();
		System.out.println("Digite o nome do aluno: ");
		a1.nome = teclado.nextLine();
		System.out.println("Digite a idade do aluno: ");
		a1.idade = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Digite o CPF do aluno: ");
		a1.cpf = teclado.nextLine();
		System.out.println("Digite a matricula do aluno: ");
		a1.matricula = teclado.nextLine();
		
		System.out.println("Aluno instanciado");
		System.out.println("Nome: " + a1.nome);
		System.out.println("Idade: " + a1.idade);
		System.out.println("Matricula: " + a1.matricula);
		System.out.println("CPF: " + a1.cpf);
		
		Aluno a2 = new Aluno();
		System.out.println("Digite o nome do aluno: ");
		a2.nome = teclado.nextLine();
		System.out.println("Digite a idade do aluno: ");
		a2.idade = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Digite o CPF do aluno: ");
		a2.cpf = teclado.nextLine();
		System.out.println("Digite a matricula do aluno: ");
		a2.matricula = teclado.nextLine();
		
		System.out.println("Aluno instanciado");
		System.out.println("Nome: " + a2.nome);
		System.out.println("Idade: " + a2.idade);
		System.out.println("Matricula: " + a2.matricula);
		System.out.println("CPF: " + a2.cpf);
		
		Aluno a3 = new Aluno();
		System.out.println("Digite o nome do aluno: ");
		a3.nome = teclado.nextLine();
		System.out.println("Digite a idade do aluno: ");
		a3.idade = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Digite o CPF do aluno: ");
		a3.cpf = teclado.nextLine();
		System.out.println("Digite a matricula do aluno: ");
		a3.matricula = teclado.nextLine();

		System.out.println("Aluno instanciado");
		System.out.println("Nome: " + a3.nome);
		System.out.println("Idade: " + a3.idade);
		System.out.println("Matricula: " + a3.matricula);
		System.out.println("CPF: " + a3.cpf);
		
	}

}

```
