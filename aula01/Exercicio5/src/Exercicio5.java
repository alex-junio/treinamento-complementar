import java.util.Scanner;

/*
 Escreva um programa que leia v�rios n�meros inteiros digitados pelo usu�rio, at� que o usu�rio digite zero. O zero termina o programa e exibe a soma de todos os valores digitados. 
 */

public class Exercicio5 {

	public static void main(String[] args) {
		System.out.println("� o seguinte: voc� vai digitar v�rios n�meros inteiros (nada de n�meros quebrados);");
		System.out.println("O programa vai exibir a soma de todos eles, assim que o n�mero digitado for 0.");
		System.out.println("Ah, eu j� mencionei que � pra digitar s� n�meros inteiros?");
		Scanner teclado = new Scanner(System.in);
		int soma = 0, numero;
		System.out.println("Qual o n�mero?");
		numero = teclado.nextInt();
		while (numero != 0) {
			soma += numero;
			System.out.println("Digite um n�mero.");
			numero = teclado.nextInt();

		}
		System.out.println("A soma dos n�meros digitados �: " + soma);
		teclado.close();
	}

}
