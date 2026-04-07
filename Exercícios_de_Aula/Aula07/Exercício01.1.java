package pkg;

public class ContaBancaria {
	private double saldo, limite;
	
	public ContaBancaria(double saldo, double limite) {
		this.saldo = saldo;
		this.limite = limite;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double getLimite() {
		return limite;
	}
	
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public void saque(double valor) {
		if(saldo - valor >= -limite) {
			saldo -= valor;
			System.out.println("Novo saldo: " + saldo);
		} else {
			System.out.println("Limite alcançado");
		}
	}
}
