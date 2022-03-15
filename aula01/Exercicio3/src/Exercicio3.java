import java.util.Scanner;

/*
 * Escreva um programa que leia um número inteiro digitado pelo usuário e exiba uma sequência de números de 1 até o valor digitado pelo usuário. 
Por exemplo, se o usuário digitar o número 8, o programa deve mostrar
1 2 3 4 5 6 7 8
*/

public class Exercicio3 {
	public static void main(String[] args) {
		System.out.println("Escolha um número para ver o que vem antes dele.");
		System.out.println(
				"O programa mostrará os números anteriores ao que foi digitado e, só porque sim, mostrará o número digitado também. Aproveita que é de graça.");
		Scanner teclado = new Scanner(System.in);
		int numero, contador = 0;
		System.out.println("Digite um número, por favor.");
		numero = teclado.nextInt();
		while (contador <= numero) {
			System.out.println(contador);
			contador++;
		}
		teclado.close();
	}
}
