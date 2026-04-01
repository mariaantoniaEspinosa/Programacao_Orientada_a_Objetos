package pkg;

public class PrincipalPedido {

	public static void main(String[] args) {
		Pedido p = new Pedido(1, "carne", 60, 3);
		
		System.out.println("Produto: " + p.produto);
		System.out.println("Preço normal: " + p.preco);
		System.out.println("Subtotal da compra: " + p.calcularSubtotal());
		System.out.println("Subtotal com desconto: " + p.calcularDesconto(10));
		System.out.println("Total do pedido final: " + p.calcularTotal(10));
		System.out.println(p.resumoPedido());
		
	}

}
