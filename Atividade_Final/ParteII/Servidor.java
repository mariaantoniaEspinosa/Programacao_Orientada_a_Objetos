package pkj;

import java.io.*;
import java.net.*;
import java.util.ArrayList;

public class Servidor {

    public static void main(String[] args) {

        ArrayList<Veiculo> listaVeiculos = new ArrayList<>();

        try {
            ServerSocket serverSocket = new ServerSocket(12345);
            System.out.println("Servidor aguardando conexões...");

            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("Cliente conectado!");

                BufferedReader entrada = new BufferedReader(
                        new InputStreamReader(socket.getInputStream()));

                PrintWriter saida = new PrintWriter(
                        new OutputStreamWriter(socket.getOutputStream()), true);

                String dados = entrada.readLine();

                try {
                    String[] partes = dados.split(";");
                    String placa        = partes[0];
                    String modelo       = partes[1];
                    String marca        = partes[2];
                    int ano             = Integer.parseInt(partes[3]);
                    double quilometragem = Double.parseDouble(partes[4]);

                    Veiculo veiculo = new Veiculo(placa, modelo, marca, ano, quilometragem);
                    listaVeiculos.add(veiculo);
                    salvarArquivo(listaVeiculos);

                    saida.println("Veículo cadastrado com sucesso!");

                } catch (Exception e) {
                    saida.println("Erro ao cadastrar veículo.");
                }

                socket.close();
            }

        } catch (IOException e) {
            System.out.println("Erro no servidor: " + e.getMessage());
        }
    }

    public static void salvarArquivo(ArrayList<Veiculo> lista) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("veiculos.txt"));
            for (Veiculo v : lista) {
                writer.write(v.toString());
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Erro ao salvar arquivo.");
        }
    }
}
