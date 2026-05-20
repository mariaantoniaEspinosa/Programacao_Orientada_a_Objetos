package pacote4;

public class ContaBancaria {
	protected double saldo;
	
	public void  depositar(double valor) {
		saldo = saldo + valor;
	}
	
	public void depositar(double valor, double cheque) {
		saldo += cheque;
	}
}
