// Cliente.java
package pkj;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Cliente {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Placa: ");
        String placa = teclado.nextLine();

        System.out.print("Modelo: ");
        String modelo = teclado.nextLine();

        System.out.print("Marca: ");
        String marca = teclado.nextLine();

        System.out.print("Ano: ");
        int ano = teclado.nextInt();
        teclado.nextLine();

        System.out.print("Quilometragem: ");
        double quilometragem = teclado.nextDouble();
        teclado.nextLine();

        Veiculo veiculo = new Veiculo(placa, modelo, marca, ano, quilometragem);

        try {
            Socket socket = new Socket("localhost", 12345);

            PrintWriter saida = new PrintWriter(
                    new OutputStreamWriter(socket.getOutputStream()), true);

            BufferedReader entrada = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));

            saida.println(veiculo.getPlaca() + ";" + veiculo.getModelo() + ";" + veiculo.getMarca() + ";" + veiculo.getAno() + ";" + veiculo.getQuilometragem());

            String resposta = entrada.readLine();
            System.out.println("Servidor: " + resposta);

            socket.close();

        } catch (IOException e) {
            System.out.println("Erro ao conectar ao servidor: " + e.getMessage());
        }

        teclado.close();
    }
}
