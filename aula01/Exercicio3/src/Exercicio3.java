import java.util.Scanner;

/*
 * Escreva um programa que leia um n�mero inteiro digitado pelo usu�rio e exiba uma sequ�ncia de n�meros de 1 at� o valor digitado pelo usu�rio. 
Por exemplo, se o usu�rio digitar o n�mero 8, o programa deve mostrar
1 2 3 4 5 6 7 8
*/

public class Exercicio3 {
	public static void main(String[] args) {
		System.out.println("Escolha um n�mero para ver o que vem antes dele.");
		System.out.println(
				"O programa mostrar� os n�meros anteriores ao que foi digitado e, s� porque sim, mostrar� o n�mero digitado tamb�m. Aproveita que � de gra�a.");
		Scanner teclado = new Scanner(System.in);
		int numero, contador = 0;
		System.out.println("Digite um n�mero, por favor.");
		numero = teclado.nextInt();
		while (contador <= numero) {
			System.out.println(contador);
			contador++;
		}
		teclado.close();
	}
}
