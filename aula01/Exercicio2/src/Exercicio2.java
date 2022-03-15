import java.util.Scanner;

/*
 * Exercício 2
A prefeitura do Rio de Janeiro abriu uma linha de crédito para os funcionários estatutários. Entretanto, o valor máximo da prestação não poderá ultrapassar 30% do salário bruto. Faça um programa que leia o salário bruto e o valor da prestação e informe se o empréstimo pode ou não ser concedido.

 */
public class Exercicio2 {

	public static void main(String[] args) {
		System.out.println("Veja se você está elegível a realizar um empréstimo");
		System.out.println(
				"Para checar a possibilidade, você deve informar o seu salário bruto e o valor que pretende pagar por mês");
		System.out.println("O valor da parcela mensal não pode ultrapassar 30% (trinta por cento) do salário bruto");
		Scanner teclado = new Scanner(System.in);
		double salario, prestacao;
		System.out.println("Qual seu salário?");
		salario = teclado.nextDouble();
		System.out.println("Quanto pretende pagar por mês?");
		prestacao = teclado.nextDouble();
		double limite = salario * 0.3;
		if (prestacao <= limite) {
			System.out.println("O impréstimo pode ser concedido.");
		} else {
			System.out.println(
					"O impréstimo não pode ser concedido nessas condições. O valor mácimo da prestação deve ser "
							+ limite);
		}
		teclado.close();
	}
}
