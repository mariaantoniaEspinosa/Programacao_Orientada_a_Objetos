1) Explique os seguintes conceitos de POO em Java:
   
a) Classe: é uma estrutura que abstrai um conjunto de objetos com características similares, ela define o comportamento dos objetos atráveis de métodos e atributos.

b) Objeto: é a instância de uma classe, onde é possível ter vários objetos a partir de uma classe, como por exemplo Carro -> Gol.

c) Atributo: são as variáveis na linguagem estruturada, ou seja, as características do objeto.

d) Método: são as funcionalidades do objeto, isto é as funções na linguagem estruturada.

e) Encapsulamento: é o empacotamento dos atributo e métodos numa classe, serve para proteção dos dados.

2) Qual a diferença entre método e construtor em uma classe? Dê um exemplo.

   Um método pode ou não retornar um valor, na sua declaração é preciso especificar os tipos dos parâmetros e os nomes que eles terão dentro do método, exige algum tipo de retorno.
   
   Um construtor é um tipo de método que pode ser utilizado para inicializar um objeto de uma classe, sem retornar algo e com nome igual à classe.
```
public class Carro {
    String modelo;

    // CONSTRUTOR: Tem o mesmo nome da classe, sem retorno
    public Carro(String modelo) {
        this.modelo = modelo; // Inicializa o atributo
    }

    // MÉTODO: Ação que o objeto pode realizar
    public void exibirModelo() {
        System.out.println("O modelo é: " + this.modelo);
    }
}

// Uso:
Carro c = new Carro("Fusca"); // Chama o construtor
c.exibirModelo();             // Chama o método

```
3) O que são modificadores de acesso em Java? Cite e explique brevemente os principais.

   Os modificadores de acesso são palavras-chaves que definem o nível de visibilidade/acessibilidade das variáveis em Java.

   As principais usadas em aula são: Public -> para nível menos restritivo; Private -> para o nível mais restritivo;

   Outras: Default -> acessível apenas por classes do mesmo pacote; Protected -> acessível por membros do mesmo pacote;

4) Qual a diferença entre os tipos de dados String, int e boolean? Dê um exemplo de uso de cada um.

   String: armazena texto/cadeias de caracteres entre aspas duplas;
   String produto = "Celular"

   Int: armaneza números inteiros;
   int quantidade = 3;

   Boolean: assume dois valores lógicos, um de cada vez, true or false;
   booelan estoque = true;

5) Explique o que é e para que serve o método toString() em uma classe.

   O método toString() é usado em Java para obter um objeto string que representa o valor de um objeto numérico, ou seja<  ele converte um número em uma string.
   Isto é um método da classe Java Object.

6) Descreva o que acontece quando se tenta acessar um atributo privado diretamente fora da classe. Como é possível acessá-lo de forma correta?

   Irá acontecer um erro de compilação, pois o modificador de acesso privado é a forma mais restritiva de visibilidade, sendo que a forma correta de acessá-lo será por meio de métodos públicos, como Getters e Setters.
