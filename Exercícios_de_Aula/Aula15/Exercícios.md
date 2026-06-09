4) Crie uma classe chamada Animal com os atributos privadas Nome e Idade. Também deve possuir os métodos get e set para encapsulamento. Crie também um
método abstrato chamado EmitirSom. Crie duas classes que herdam de Animal, uma chamada Cachorro e outra chamada Gato, que implementam o método
EmitirSom.
5) Faça as implementações dos métodos do exercício 1 para uma ContaInvestimento e ContaPoupanca e apresente mensagens na tela. A ContaInvestimento deve
possuir um método atualizaRendimentos que deve acrescer 5% ao saldo. Já a ContaPoupanca deve possuir um método atualizaJuros que deve acrescer 3% ao
saldo da conta.
6) Crie uma classe abstrata chamada Veiculo com as propriedades Marca, Modelo e Ano. Crie dois métodos abstratos chamados Acelerar e Frear. Crie duas
classes que herdam de Veiculo, uma chamada Carro e outra chamada Moto, que implementam os métodos Acelerar e Frear.
7) Crie uma classe abstrata chamada Pessoa com as propriedades Nome e Cidade. Crie também um método abstrato chamado EfetuarCompra. Crie duas classes
que herdam de Pessoa, uma chamada PessoaFIsica e outra chamada PessoaJuridica, que implementam o método EfetuarCompra. Crie atributos específicos para
cada uma das novas classes, por exemplo, CPF em PessoaFisica e CNPJ em PessoaJuridica.
8) Crie uma classe abstrata chamada Funcionario com as propriedades Nome e Salário. Crie também um método abstrato chamado CalcularSalario. Crie duas
classes que herdam de Funcionario, uma chamada Gerente e outra chamada Vendedor, que implementam o método CalcularSalario. O gerente deve ganhar um
bônus de 20%.
9) Analisando os exercícios anteriores, quais implementações podem ser desenvolvidas com interface?
Desafio
10) Crie uma interface chamada Produto que contenha os seguintes métodos: getNome(), getPreco() e getDescricao().
11) Crie as classes Livro e CD que implementem a interface Produto. Implemente os métodos da interface para que eles retornem as informações correspondentes ao nome, preço e descrição do
produto.
12) Crie uma interface chamada AcessoDados que contenha os seguintes métodos: conectar(), desconectar(), inserir(), atualizar() e excluir().
13) Crie uma classe BancoDeDados que implemente a interface AcessoDados. Implemente os métodos da interface para que eles realizem as operações de conectar-se ao banco de dados,
desconectar-se, inserir dados, atualizar dados e excluir dados.
14) Usando a Pessoa crie um construtor que inicialize esses atributos e um método validarIdade que lance uma exceção caso a idade informada seja menor que zero ou maior que 120.
15) Crie uma classe Data com três atributos: dia, mes e ano. Crie um construtor que inicialize esses atributos e um método validarData que lance uma exceção IllegalArgumentException caso a
data informada não seja válida (por exemplo, dia 31 de fevereiro).
16) Crie uma classe Triangulo com três atributos: lado1, lado2 e lado3. Crie um construtor que inicialize esses atributos e um método validarTriangulo que lance uma exceção
IllegalArgumentException caso os valores informados não formem um triângulo válido (por exemplo, se a soma de dois lados for menor ou igual ao terceiro lado).
17) Crie uma classe Agenda com um método adicionarContato que receba o nome e o telefone de um contato e lance uma exceção IllegalArgumentException caso o nome ou o telefone sejam
nulos ou vazios
