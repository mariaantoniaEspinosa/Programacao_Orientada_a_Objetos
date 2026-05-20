package pacote6;

public class Main {
	public static void main(String[] args) {
		Funcionario[] func = new Funcionario[2];
		
		func[0]= new Gerente("Maria", 1200, 500);
		func[1]=new Desenvolvedor("Mariazinha", 1500, 50);
		
		func[0].aumentarSalario(10);
		func[1].aumentarSalario(10);
		
		((Gerente) func[0]).aumentarSalario(10, 200);
		
		for(Funcionario f : func) {
			System.out.println(f);
		}
	}
}
