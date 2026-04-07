# Encapsulamento 
- public: permite que qualquer classe possa acessar o membro.
- private: permite somente que a própria classe possa acessar o membro.
- protected: permite que as subclasses e classes do mesmo pacote possam acessar o membro.
- default: permite que as classes do mesmo pacote possam acessar o membro.
## Funções getters e setters
- getters: método que obtém as informações que queremos do atributo.
- setters: métodos usados para alterar o valor de um atributo; define valores
- exemplo: atributo privado "nome" = "getNome()", "setNome()"
### Código de exemplo da Aula
```
package pkg;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Pessoa p = new Pessoa("Maria", 20);
		Scanner teclado = new Scanner(System.in);
		
		/*String nome;
		nome = p.getNome(); //retorna uma string com o nome
		System.out.println("Nome: " + nome);*/
		
		System.out.println("Nome: " + p.getNome());
		
		/*int idade;
		idade = p.getIdade();*/
		
		System.out.println("Idade: " + p.getIdade() + " anos");
		
		String nome;
		System.out.print("Digite o novo nome: ");
		nome = teclado.nextLine();
		p.setNome(nome);
		if(nome.isBlank() || nome.isEmpty() || nome == null) {
			System.out.println("Nome: " + p.getNome());
		} else {
			System.out.println("Novo nome: " + p.getNome());
		}
				
		int idade;
		System.out.print("Digite nova idade: ");
		idade = teclado.nextInt();
		p.setIdade(idade); // ou p.setIdade(teclado.nextInt());
		if(idade>0) {
			System.out.println("Nova idade: " + p.getIdade());
		} else {
			System.out.println("Idade: " + p.getIdade());
		}
		
	}

}
```
## Diagrama de Classes
- (- atributo ) = privado
- ( + metodo()) = publico

## Exemplo 
### Classe
```
package pkg;

public class Aluno {
	private String nome;
	private double nota1, nota2;
	
	public Aluno(String nome, int nota1, int nota2) {
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getNota1() {
		return nota1;
	}
	
	public double getNota2() {
		return nota2;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setNota1(int nota1) {
		this.nota1 = nota1;
	}
	
	public void setNota2(int nota2) {
		this.nota2 = nota2;
	}
	
	public double calculaMedia() {
		return (nota1 + nota2)/2;
	}
	
}
```
### Main
```
package pkg;

import java.util.Scanner;

public class PrincipalAluno {

	public static void main(String[] args) {
		Aluno l = new Aluno("Maria", 8, 10);
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Nome do aluno: " + l.getNome());
		System.out.println("Nota 1: " + l.getNota1());
		System.out.println("Nota 2: " + l.getNota2());
		System.out.println("Média final: " + l.calculaMedia());
	}
}

```
