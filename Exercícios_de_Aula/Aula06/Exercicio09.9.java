package pkg;

public class Time {
	public String nome;
	public int golsMarcados;
	public int golsSofridos;
	
	public Time(String n, int gm, int gs) {
		nome = n;
		golsMarcados = gm;
		golsSofridos = gs;
	}
	
	public void marcarGol() {
		golsMarcados++;
	}
	
	public void sofrerGol() {
		golsSofridos++;
	}
	
	public int saldoGols() {
		return golsMarcados - golsSofridos;
	}
	
	public String resultadoPartida() {
		if(saldoGols()>0) {
			return "Vitória";
		} else if(saldoGols()==0) {
			return "Empate";
		} else {
			return "Derrota";
		}
	}
}
