# Serialização 
## Arquivos
- A manipulação de arquivos se dá por meio de algumas classes:
  - FileWriter: usada para escrever caracteres em um arquivo
  - Bufferedwriter: usada para grandes quantidades de dados de caracteres em um fluxo de saída com melhor desempenho
  - FileReader: usada para ler caracteres de um arquivo
  - BufferedReader: usada para ler grandes quantidades de caracteres de um fluxo de entrada em melhor desempenho
### Exemplo
- Classe Principal 
```
package exemplo1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Principal {
	public static void main(String[] args) {
		//Criando objetos Aluno
		Aluno aluno1 = new Aluno("João", 20);
		Aluno aluno2 = new Aluno("Maria", 22);
		Aluno aluno3 = new Aluno("Pedro", 19);
		
		//Escrevendo os alunos em um arquivo txt
		try {
			FileWriter arquivo = new FileWriter("alunos.txt");
			BufferedWriter escritor = new BufferedWriter(arquivo);
			
			//Escrevendo alunos no arquivo
			escritor.write(aluno1.getNome() + ", " + aluno1.getIdade());
			escritor.newLine();
			
			escritor.write(aluno2.getNome() + ", " + aluno2.getIdade());
			escritor.newLine();
			
			escritor.write(aluno3.getNome() + ", " + aluno3.getIdade());
			escritor.newLine();
			
			escritor.close();
			arquivo.close();
			
			System.out.println("Alunos salvos no arquivo alunos.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//Lendo os alunos do arquivo
		try {
			FileReader arquivo = new FileReader ("alunos.txt");
			BufferedReader leitor = new BufferedReader(arquivo);
			
			System.out.println("Alunos lidos do arquivo");
			
			String linha;
			while((linha = leitor.readLine()) != null) {
				String[] campos = linha.split(", ");
				
				String nome = campos [0];
				int idade = Integer.parseInt(campos[1]);
				
				Aluno aluno = new Aluno(nome, idade);
				
				System.out.println("Nome: " + aluno.getNome() + ", Idade: " + aluno.getIdade());
			}
			
			leitor.close();
			arquivo.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
```
- Classe Aluno
```
package exemplo1;

public class Aluno {
	private String nome;
	private int idade;
	
	public Aluno(String nome, int idade) {
		super();
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
