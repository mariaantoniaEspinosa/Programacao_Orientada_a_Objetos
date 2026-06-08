public class Main {

    public static void main(String[] args) {

        Carro carro = new Carro("Toyota", "Corolla", 2024);
        Moto moto = new Moto("Honda", "CG 160", 2023);

        carro.acelerar();
        carro.frear();

        System.out.println();

        moto.acelerar();
        moto.frear();
    }
}
