import java.util.Scanner;

/*
 * Exerc�cio 2
A prefeitura do Rio de Janeiro abriu uma linha de cr�dito para os funcion�rios estatut�rios. Entretanto, o valor m�ximo da presta��o n�o poder� ultrapassar 30% do sal�rio bruto. Fa�a um programa que leia o sal�rio bruto e o valor da presta��o e informe se o empr�stimo pode ou n�o ser concedido.

 */
public class Exercicio2 {

	public static void main(String[] args) {
		System.out.println("Veja se voc� est� eleg�vel a realizar um empr�stimo");
		System.out.println(
				"Para checar a possibilidade, voc� deve informar o seu sal�rio bruto e o valor que pretende pagar por m�s");
		System.out.println("O valor da parcela mensal n�o pode ultrapassar 30% (trinta por cento) do sal�rio bruto");
		Scanner teclado = new Scanner(System.in);
		double salario, prestacao;
		System.out.println("Qual seu sal�rio?");
		salario = teclado.nextDouble();
		System.out.println("Quanto pretende pagar por m�s?");
		prestacao = teclado.nextDouble();
		double limite = salario * 0.3;
		if (prestacao <= limite) {
			System.out.println("O impr�stimo pode ser concedido.");
		} else {
			System.out.println(
					"O impr�stimo n�o pode ser concedido nessas condi��es. O valor m�cimo da presta��o deve ser "
							+ limite);
		}
		teclado.close();
	}
}
