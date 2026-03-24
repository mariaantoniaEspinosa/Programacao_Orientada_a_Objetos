## Revisão Exercício 04 - Aula 04
###  Main
```
package pkg;

public class Principal {

	public static void main(String[] args) {
		ContaCorrente novaConta = new ContaCorrente();
		novaConta.definirSaldoIncial(1000);
		System.out.println("Saldo da conta: " + novaConta.saldo);
		novaConta.sacar(500);
		novaConta.depositar(50);
		System.out.println("Saldo da conta: " + novaConta.saldo);
		novaConta.sacar(600);
		System.out.println("Saldo da conta: " + novaConta.saldo);

	}

}
```
### Classe 
```
package pkg;

public class ContaCorrente {
	public float saldo;
	public void definirSaldoIncial(float valor) {
		saldo = valor;
	}
	public void depositar(float valor) {
		saldo = saldo + valor;
		//saldo+=valor;
		System.out.println("Deposito de: " + valor + "efetuado");
	}
	public boolean sacar(float valor) {
		if(saldo>=valor) {
			saldo -= valor;
			System.out.println("Método sacar: Saldo suficiente");
			return true;
		}
		System.out.println("Método sacar: Saldo insuficiente");
		return false;
	}
}
```
## Tratamento de Exceções 
### Exemplo 01 
```
package pkg;

public class Principal2 {

	public static void main(String[] args) {
		try { 
			int [] numeros = {1, 2, 3};
			System.out.println(numeros[3]);
		} catch (Exception e) {
			System.out.println("Exceção: " + e.toString());
		}
		System.out.println("Sistema segue funcionando");
		
	}

}
```
### Exemplo 01 
```
package pkg;

public class Principal2 {

	public static void main(String[] args) {
		try { 
			int [] numeros = {1, 2, 3};
			System.out.println(numeros[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Erro: indíce fora do array\n " + e.getMessage());
		} catch (Exception e){
		System.out.println("Exceção: " + e.toString());
		}
		
	}

}
```
### Exemplo 02
```
package pkg;

public class Principal3 {

	public static void main(String[] args) {
		
		try {
			int a = 10;
			int b = 0;
			System.out.println(a/b);
		} catch (ArithmeticException e) {
			System.out.println("Erro: divisão por zero!\n" + e.getMessage());
		}catch (Exception e){
			System.out.println("Exceção: " +e.toString());
		}

	}

}
```
### Exemplo 03
```
package pkg;

public class Principal4 {

	public static void main(String[] args) {
		
		try{
			String numero = "abc";
			int valor = Integer.parseInt(numero);
		} catch(NumberFormatException e) {
			System.out.println("Erro: variável não condiz\n" + e.getMessage());
		}
		catch (Exception e) {
			System.out.println("Exceção: " + e.toString());
		}

	}

}

```
