public class PessoaJuridica extends Pessoa {

    private String cnpj;

    public PessoaJuridica(String nome, String cidade, String cnpj) {
        super(nome, cidade);
        this.cnpj = cnpj;
    }

    @Override
    public void efetuarCompra(double valor) {
        System.out.println("Pessoa Jurídica " + nome +
                " efetuou uma compra de R$ " + valor);
    }
}
