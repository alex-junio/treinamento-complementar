import java.util.Scanner;

/*
 * Exerc�cio 1

Fa�a um programa que leia duas notas de um aluno, calcule e mostre a m�dia aritm�tica do aluno.


 */

public class Exercicio1 {
	public static void main(String[] args) {
		System.out.println("Descubra a m�dia aritm�tica, fornecendo duas notas");
		Scanner teclado = new Scanner(System.in);
		double nota1, nota2;
		System.out.println("Digite a primeira nota:");
		nota1 = teclado.nextDouble();
		System.out.println("Digite a segunda nota:");
		nota2 = teclado.nextDouble();
		System.out.println("A m�dia �: " + (nota1 + nota2) / 2);
		teclado.close();
	}
}
