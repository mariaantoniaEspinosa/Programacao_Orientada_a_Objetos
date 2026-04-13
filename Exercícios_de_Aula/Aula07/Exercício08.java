package pkg;

public class Retangulo {
	private int x, y;
	
	public Retangulo(int a, int b) {
		this.x = a;
		this.y = b;
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void inserir_lados(int a, int b) {
		this.x = a;
		this.y = b;
	}
	
	public void calcular_area() {
		System.out.println("Area do Retangulo: " + x * y);
		
	}
}
