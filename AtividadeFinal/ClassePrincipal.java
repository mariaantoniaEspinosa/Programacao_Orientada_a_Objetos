package pkj;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Veiculo> listaVeiculos = new ArrayList<>();

        int opcao;

        do {

            System.out.println("SISTEMA DE VEÍCULOS");
            System.out.println("1 - Cadastrar veículo");
            System.out.println("2 - Alterar quilometragem do veículo");
            System.out.println("3 - Excluir veículo pelo número da placa");
            System.out.println("4 - Sair do sistema");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:

                    System.out.print("Placa: ");
                    String placa = sc.nextLine();

                    System.out.print("Modelo: ");
                    String modelo = sc.nextLine();
                    
                    System.out.println("Marca: ");
                    String marca = sc.nextLine();
                    
                    System.out.println("Ano: ");
                    int ano = sc.nextInt();
                    sc.nextLine();
                    
                    System.out.print("Quilometragem: ");
                    double quilometragem = sc.nextInt();
                    sc.nextLine();

                    Veiculo veiculo = new Veiculo (placa, modelo ,marca, ano, quilometragem);

                    listaVeiculos.add(veiculo);

                    salvarArquivo(listaVeiculos);

                    System.out.println("Veículo cadastrado com sucesso!");
                    break;

                case 2:

                    System.out.print("Digite a placa do veículo: ");
                    String placaAlterar = sc.nextLine();

                    boolean encontrado = false;

                    for (Veiculo v : listaVeiculos) {

                        if (v.getPlaca().equalsIgnoreCase(placaAlterar)) {

                            System.out.print("Nova quilometragem: ");
                            int novaKm = sc.nextInt();
                            sc.nextLine();

                            v.setQuilometragem(novaKm);

                            salvarArquivo(listaVeiculos);

                            System.out.println("Quilometragem atualizada!");
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Veículo não encontrado.");
                    }

                    break;

                case 3:

                    System.out.print("Digite a placa do veículo: ");
                    String placaExcluir = sc.nextLine();

                    encontrado = false;

                    for (int i = 0; i < listaVeiculos.size(); i++) {

                        if (listaVeiculos.get(i).getPlaca().equalsIgnoreCase(placaExcluir)) {

                            listaVeiculos.remove(i);

                            salvarArquivo(listaVeiculos);

                            System.out.println("Veículo removido com sucesso!");
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Veículo não encontrado.");
                    }

                    break;

                case 4:

                    System.out.println("Sistema encerrado.");
                    break;

                default:

                    System.out.println("Opção inválida.");
            }

        } while (opcao != 4);

        sc.close();
    }

    public static void salvarArquivo(ArrayList<Veiculo> listaVeiculos) {

        try {

            BufferedWriter writer = new BufferedWriter(
                    new FileWriter("veiculos.txt"));

            for (Veiculo v : listaVeiculos) {
                writer.write(v.toString());
                writer.newLine();
            }

            writer.close();

        } catch (IOException e) {
            System.out.println("Erro ao salvar arquivo.");
        }
    }
}
