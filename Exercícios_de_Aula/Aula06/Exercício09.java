package pkg;

public class PrincipalTime {

	public static void main(String[] args) {
		Time t = new Time("Grêmio", 4, 2);
		
		t.marcarGol();
		t.sofrerGol();
		
		System.out.println("Time: " + t.nome);
		System.out.println("Gols marcados: " + t.golsMarcados);
		System.out.println("Gols sofridos: " + t.golsSofridos);
		System.out.println("Saldo de gols: " + t.saldoGols());
		System.out.println("Resultadp: " + t.resultadoPartida());

	}

}
