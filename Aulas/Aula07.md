# Encapsulamento 
- public: permite que qualquer classe possa acessar o membro.
- private: permite somente que a própria classe possa acessar o membro.
- protected: permite que as subclasses e classes do mesmo pacote possam acessar o membro.
- default: permite que as classes do mesmo pacote possam acessar o membro.
- # Funções getters e setters
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
