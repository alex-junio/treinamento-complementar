package relogio;

public class Relogio {
	private int hora = 00, minuto, segundo;

	public Relogio(int hora, int minuto, int segundo) {
		setHora(hora);
		setMinuto(minuto);
		setSegundo(segundo);
	}

	public void setHora(int novaHora) {
		if (novaHora >= 0 && novaHora <= 23) {
			hora = novaHora;
		}
	}

	public void setMinuto(int novoMinuto) {
		if (novoMinuto >= 0 && novoMinuto <= 59) {
			minuto = novoMinuto;
		}
	}

	public void setSegundo(int novoSegundo) {
		if (novoSegundo >= 0 && novoSegundo <= 59) {
			segundo = novoSegundo;
		}
	}

	public int getHora() {
		return hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public int getSegundo() {
		return segundo;
	}

	public String getHoraAtual() {
		return hora + ":" + minuto + ":" + segundo;
	}
}
