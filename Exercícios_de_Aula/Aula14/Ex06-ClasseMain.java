public class Main {

    public static void main(String[] args) {

        Gerente gerente = new Gerente("Carlos", 5000);
        Vendedor vendedor = new Vendedor("Ana", 3000);

        System.out.println("Salário do gerente: R$ "
                + gerente.calcularSalario());

        System.out.println("Salário do vendedor: R$ "
                + vendedor.calcularSalario());
    }
}
