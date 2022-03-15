import java.util.Scanner;

/*
 Escreva um programa que leia vários números inteiros digitados pelo usuário, até que o usuário digite zero. O zero termina o programa e exibe a soma de todos os valores digitados. 
 */

public class Exercicio5 {

	public static void main(String[] args) {
		System.out.println("É o seguinte: você vai digitar vários números inteiros (nada de números quebrados);");
		System.out.println("O programa vai exibir a soma de todos eles, assim que o número digitado for 0.");
		System.out.println("Ah, eu já mencionei que é pra digitar só números inteiros?");
		Scanner teclado = new Scanner(System.in);
		int soma = 0, numero;
		System.out.println("Qual o número?");
		numero = teclado.nextInt();
		while (numero != 0) {
			soma += numero;
			System.out.println("Digite um número.");
			numero = teclado.nextInt();

		}
		System.out.println("A soma dos números digitados é: " + soma);
		teclado.close();
	}

}
