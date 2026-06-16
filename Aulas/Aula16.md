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
### Continuação do Exemplo
- Classe Arquivo
```
package exemplo2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import exemplo1.Aluno;

public class Arquivo {
	private FileWriter arqw;
	private BufferedWriter escritor;
	private FileReader arqr;
	private BufferedReader leitor;
	private List<Aluno> listAlunos;
	private String nomeArquivo;
	
	public Arquivo(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
		listAlunos = new ArrayList<>();
	}
	
	public void gravarArquivo(Aluno a) {
		//Escrevendo os alunos em um arquivo de texto
		try {
			//escrevendo os alunos no arquivo
			arqw = new FileWriter(nomeArquivo + ".txt", true);
			escritor = new BufferedWriter(arqw);
			escritor.write(a.getNome() + ", " + a.getIdade());
			escritor.newLine();
			escritor.close();
			arqw.close();
			
			System.out.println("Alunos salvos no arquivo aluno");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public List<Aluno> leArquivo(){
		//Lendo os alunos do arquivo
		
		System.out.println("Alunos lidos do arquivo");
		try {
			arqr = new FileReader (nomeArquivo+ ".txt");
			leitor = new BufferedReader(arqr);
			String linha;
			while((linha = leitor.readLine()) != null){
				String [] campos = linha.split(", ");
				
				String nome = campos[0];
				int idade = Integer.parseInt(campos[1]);
				Aluno aluno = new Aluno (nome, idade);
				listAlunos.add(aluno);
			}
			
			leitor.close();
			arqr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return listAlunos;
	}
}

```
- Classe Principal
```
package exemplo2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import exemplo1.Aluno;

public class Principal {
	public static void main(String[] args) {
		//Criando objetos aluno
		/*Aluno aluno1 = new Aluno("João", 20);
		Aluno aluno2 = new Aluno("Maria", 22);
		Aluno aluno3 = new Aluno("Alziras", 19);
		
		List<Aluno> lista = new ArrayList<>();
		
		Arquivo arquivo = new Arquivo ("alunos");
		
		arquivo.gravarArquivo(aluno1);
		arquivo.gravarArquivo(aluno2);
		arquivo.gravarArquivo(aluno3);
		
		lista = arquivo.leArquivo();
		
		for(Aluno a : lista) {
			System.out.println("Nome: " + a.getNome() + ", Idade: " + a.getIdade());
		}*/
		
		Scanner teclado = new Scanner(System.in);
		Arquivo arquivo = new Arquivo ("alunos");
		List<Aluno> lista;
		
		int op = 0;
		
		while(op != 3) {
			System.out.println("1- Cadastrar Aluno");
			System.out.println("2- Listas Alunos");
			System.out.println("3- Sair");
			System.out.println("EScolha uma opção: ");
			op = teclado.nextInt();
			teclado.nextLine();
			
			switch(op) {
			case 1:
				System.out.println("Digite o nome do aluno: ");
				String nome = teclado.nextLine();
				
				System.out.println("Digite a idade do aluno: ");
				int idade = teclado.nextInt();
				teclado.nextLine();
				
				Aluno novoAluno = new Aluno(nome, idade);
				arquivo.gravarArquivo(novoAluno);
				break;
			case 2:
				lista = arquivo.leArquivo();
				if(lista == null || lista.isEmpty()) {
					System.out.println("Nenhum aluno cadastrado");
				} 
				else {
					for(Aluno a : lista) {
						System.out.println("Nome: " + a.getNome() + ", Idade: " + a.getIdade());
						
					}
				}
				break;
			case 3:
				System.out.println("Programa encerrado");
				break;
			default:
				System.out.println("Opção inválida");
				break;
			}
		}
		teclado.close();
	}
}

```
## Serialização e Desserialização
- processo de converter um objeto em um fluxo de bytes para armazenar o objeto ou transmiti-lo para a memória, um banco de dados ou um arquivo.
- salvar o estado de um objeto para recriá-lo quando necessário.
- processo inverso: desserialização
- garante a comunicação entre aplicações.
### Exemplo
- Classe Produto
```
package exemplo3;

import java.io.Serializable;

public class Produto implements Serializable {
	private String codigo;
	private String nome;
	private double preco;
	private transient String temporario;
	
	//transient: objeto vai ser ignorado pelo sistema
	
	public Produto(String codigo, String nome, double preco, String temporario) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
		this.temporario = temporario;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

	public String getTemporario() {
		return temporario;
	}
	
	@Override
	public String toString() {
		return "Produto [codigo = " + codigo + ", nome = " + nome + ", preço = " + preco + "]";
	}
	

}

```
- Classe Principal
```
package exemplo3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Principal {
	public static void main(String[] args) {
		Produto produto = new Produto("ABC123", "Exemplo de Produto", 9.99, "Caso temporário");
		
		//Serialização
		try {
			FileOutputStream arquivoSaida = new FileOutputStream("produto.ser");
			ObjectOutputStream objetoSaida = new ObjectOutputStream(arquivoSaida);
			
			objetoSaida.writeObject(produto);
			objetoSaida.close();
			arquivoSaida.close();
			System.out.println("Objeto serializado e salvo em produto.ser");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//Desserialização
		try {
			FileInputStream arquivoEntrada = new FileInputStream("produto.ser");
			ObjectInputStream objetoEntrada = new ObjectInputStream (arquivoEntrada);
			
			Produto produtoDesserializado = (Produto) objetoEntrada.readObject();
			objetoEntrada.close();
			arquivoEntrada.close();
			
			System.out.println("Objeto desserializado: " + produtoDesserializado);
			System.out.println("Vai apresentar NULL: " + produtoDesserializado.getTemporario());
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}

```
