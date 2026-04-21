package pkg;
import java.util.Scanner;

public class MainProduto2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Produto produto = null;
        int opcao;

        do {
            System.out.println("\nMENU");
            System.out.println("1 – Criar produto informando nome");
            System.out.println("2 – Criar produto informando nome e preço");
            System.out.println("3 – Exibir informações do produto");
            System.out.println("4 – Atribuir nome do produto");
            System.out.println("5 – Obter nome do produto");
            System.out.println("6 – Atribuir preço do produto");
            System.out.println("7 – Obter preço do produto");
            System.out.println("8 – Atribuir quantidade em estoque");
            System.out.println("9 – Obter quantidade em estoque");
            System.out.println("0 – Sair");

            opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome: ");
                    String nome1 = sc.nextLine();
                    produto = new Produto(nome1);
                    break;

                case 2:
                    System.out.print("Digite o nome: ");
                    String nome2 = sc.nextLine();
                    System.out.print("Digite o preço: ");
                    double preco = sc.nextDouble();
                    produto = new Produto(nome2, preco);
                    break;

                case 3:
                    if (produto != null)
                        produto.exibirInformacoes();
                    else
                        System.out.println("Produto não criado!");
                    break;

                case 4:
                    if (produto != null) {
                        System.out.print("Novo nome: ");
                        produto.setNome(sc.nextLine());
                    }
                    break;

                case 5:
                    if (produto != null)
                        System.out.println("Nome: " + produto.getNome());
                    break;

                case 6:
                    if (produto != null) {
                        System.out.print("Novo preço: ");
                        produto.setPreco(sc.nextDouble());
                    }
                    break;

                case 7:
                    if (produto != null)
                        System.out.println("Preço: " + produto.getPreco());
                    break;

                case 8:
                    if (produto != null) {
                        System.out.print("Quantidade: ");
                        produto.setQuantidadeEstoque(sc.nextInt());
                    }
                    break;

                case 9:
                    if (produto != null)
                        System.out.println("Estoque: " + produto.getQuantidadeEstoque());
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }
}
