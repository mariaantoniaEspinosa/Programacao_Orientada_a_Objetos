# O que irá cair na Prova da Semana que vem? 
- atributos
- métodos
- construtores 
- encapsulamento
# Aula de exercícios de Revisão 
- prova terá parte objetiva sobre orientação a objetos (exempo: o que é uma classe?)
- parte dois será de exercícios práticos na IDE Eclipse sem cabo de rede
## Questões Teóricas
1) Explique os seguintes conceitos de POO em Java:

a) Classe

b) Objeto

c) Atributo

d) Método

e) Encapsulamento

2) Qual a diferença entre método e construtor em uma classe? Dê um exemplo.

3) O que são modificadores de acesso em Java? Cite e explique brevemente os principais.

4) Qual a diferença entre os tipos de dados String, int e boolean? Dê um exemplo de uso de cada um.

5) Explique o que é e para que serve o método toString() em uma classe.

6) Descreva o que acontece quando se tenta acessar um atributo privado diretamente fora da classe. Como é possível acessá-lo de forma correta?

## Questões Práticas
7) Crie uma classe Produto com os atributos:

nome (String)

preco (double)

quantidade (int)

Implemente:

Um método exibirInformacoes() que exibe os dados do produto

Um método calcularValorTotal() que retorna o valor total em estoque (preço x quantidade)

Na Main:

Crie dois produtos, sendo um com valores informados via teclado e outro com valores definidos no código

Exiba as informações e o valor total de cada produto

8) Crie uma classe Usuario com os atributos:

nomeUsuario (String)

senha (String)

logado (boolean, inicialmente false)

Implemente:

Um método login(String usuario, String senha) que valida os dados e muda o valor de logado para true se estiver correto

Um método logout() que define logado como false

Um método exibirStatus() que mostra se o usuário está logado ou não

Na Main:

Crie um usuário com nome e senha definidos no código

Peça que o usuário digite os dados via teclado para fazer login

Mostre se o login foi bem-sucedido e permita o logout

9) Crie uma classe Filme com os atributos:

titulo (String)

diretor (String)

duracaoEmMinutos (int)

genero (String)

Crie os métodos:

exibirDetalhes() para mostrar todas as informações do filme

ehLongo() que retorna true se o filme tiver mais de 120 minutos

Na Main:

Peça ao usuário os dados de um filme e mostre os detalhes e se ele é considerado um filme longo

10) Crie uma classe Tarefa com os atributos:

descricao (String)

concluida (boolean, inicializado como false)

Implemente:

Um método concluirTarefa() que marca a tarefa como concluída

Um método exibirTarefa() que exibe a descrição e se ela está concluída ou não

Na Main:

Crie um vetor ou lista com 3 tarefas (usando entrada via teclado)

Marque uma das tarefas como concluída

Mostre todas as tarefas com seu status
