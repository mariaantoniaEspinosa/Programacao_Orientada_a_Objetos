package pkg;

public class ContaCorrente {
	public float saldo;
	
	public void definirSaldoInicial(float valor) {
		saldo = valor;
	}
	
	public void depositar(float valor) {
		saldo = saldo + valor;
	}
	
	public boolean sacar(float valor) {
		if(saldo >= valor) {
			saldo = saldo - valor;
			return true;
		} else {
			return false;
		}
	}
}
