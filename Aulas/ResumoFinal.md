### Classes Abstratas 
- classe que nao pode ser instanciada diretamente
- palavra-chave **abstract** antes de **class**
- métodos abstratos = sem implementação
- se a classe concentra estender a classe abstratata, essta é obrigada a implementar todos os métodos abstratos
- métodos concretos = com implementação
### Interfaces
- contrato: métodos que toda classe que a implementar deve conter
- palavra-chave **interface** no lugar de **class** e **implements** para chamar
- métodos são *public* ou *abstract*
- métodos concretos só são permitidos se forem *static*
- uma classe pode implementar várias interfaces ao mesmo tempo
## Diferença entre Classe Abstrata e Interface:
<img width="840" height="306" alt="image" src="https://github.com/user-attachments/assets/c84794a0-5e59-4192-a907-38a96715399b" />

### Exceções Personalizadas
- estentende a classe **Exeception**
- dois construtores: um sem parâmetros e outro com a mensagem de erro *String message*
- lançar a exceção: **throw new MinhaExcecao("mensagem")**
- quem chama usa *try/catch*
```
public class IdadeInvalidaException extends Exception {
    public IdadeInvalidaException() {
        super();
    }

    public IdadeInvalidaException(String mensagem) {
        super(mensagem);
    }
}
```
```
public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) throws IdadeInvalidaException {
        if (idade < 0 || idade > 120) {
            throw new IdadeInvalidaException("Idade inválida: " + idade);
        }
        this.nome = nome;
        this.idade = idade;
    }

    public void exibeDados() {
        System.out.println("Nome: " + nome + ", Idade: " + idade);
    }
}
```
```
public class Principal {
    public static void main(String[] args) {
        try {
            Pessoa p1 = new Pessoa("Ana", 25);
            p1.exibeDados(); // Nome: Ana, Idade: 25

            Pessoa p2 = new Pessoa("João", -5); // lança a exceção
            p2.exibeDados();
        } catch (IdadeInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
            // Saída: Erro: Idade inválida: -5
        }
    }
}
```

### Arquivos 
- Para Escrita:
  - **FileWriter** abre ou cria um arquivo para escrita de caracteres.
  - **BufferedWriter** melhora o desempenho do FileWriter
- Para Leitura:
  - **FileReader** abre um arquivo para leitura sequencial de caracteres.
  - **BufferedReader** melhora o desempenho do FileReader
```
public class Aluno {
    private String nome;
    private int idade;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() { return nome; }
    public int getIdade() { return idade; }
}
```
```
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Arquivo {
    private String nomeArquivo;

    public Arquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo + ".txt";
    }

    public void gravaArquivo(Aluno a) {
        try {
            FileWriter fw = new FileWriter(nomeArquivo, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(a.getNome() + "," + a.getIdade());
            bw.newLine();
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Aluno> leArquivo() {
        List<Aluno> lista = new ArrayList<>();
        try {
            FileReader fr = new FileReader(nomeArquivo);
            BufferedReader br = new BufferedReader(fr);
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] campos = linha.split(",");
                lista.add(new Aluno(campos[0], Integer.parseInt(campos[1])));
            }
            br.close();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lista;
    }
}
```
```
public class Principal {
    public static void main(String[] args) {
        Arquivo arquivo = new Arquivo("alunos");

        arquivo.gravaArquivo(new Aluno("Ana", 20));
        arquivo.gravaArquivo(new Aluno("Pedro", 22));

        for (Aluno a : arquivo.leArquivo()) {
            System.out.println(a.getNome() + " - " + a.getIdade());
        }
        // Saída:
        // Ana - 20
        // Pedro - 22
    }
}
```
