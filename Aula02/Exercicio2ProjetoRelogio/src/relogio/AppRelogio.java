package relogio;

import java.util.Scanner;

public class AppRelogio {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int hora, minuto, segundo;
		System.out.println("Quantas horas?");
		hora = teclado.nextInt();
		System.out.println("Quantos minutos?");
		minuto = teclado.nextInt();
		System.out.println("Quantos segundos?");
		segundo = teclado.nextInt();
		Relogio relogio1 = new Relogio(hora, minuto, segundo);

		relogio1.setHora(hora);
		relogio1.setMinuto(minuto);
		relogio1.setSegundo(segundo);
		System.out.println(relogio1.getHoraAtual());
		teclado.close();
	}
}
