package pacote2;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {

        List<Conta> contas = new ArrayList<Conta>();

        Conta c1 = new Conta(1, "Maria", 2500.0);
        Conta c2 = new Conta(2, "Joao", 5200.0);
        Conta c3 = new Conta(3, "Julia", 1800.0);

        contas.add(c1);
        contas.add(c2);
        contas.add(c3);

        Conta maior = maiorSaldo(contas);

        System.out.println("Conta com maior saldo:");
        System.out.println("Numero: " + maior.getNumero());
        System.out.println("Titular: " + maior.getTitular());
        System.out.println("Saldo: " + maior.getSaldo());
    }

    public static Conta maiorSaldo(List<Conta> contas) {

        Conta maior = contas.get(0);

        for (Conta c : contas) {

            if (c.getSaldo() > maior.getSaldo()) {
                maior = c;
            }
        }

        return maior;
    }
}
