import java.util.Scanner;

import modelo.ContaCorrente;
import modelo.ContaEspecial;
import util.GerenciaContas;

public class AppContas {

	static private GerenciaContas gc = new GerenciaContas();
	static private ContaCorrente cc;
	static private ContaEspecial ce;
	static private Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		int opcao = 0;
		int numeroConta;
		String menu = "O que voc� deseja fazer?\r\n1: Criar conta;\r\n2: Remover conta;\r\n3: Buscar;\r\n4: Depositar;\r\n5: Sacar;\r\n6: Sair;";
		String menuCriarConta = "Qual o tipo da conta? \r\n1: Conta Corrente;\r\n2: Conta Especial;";

		while (opcao != 6) {
			System.out.println(menu);
			opcao = teclado.nextInt();

			switch (opcao) {
			case 1: {
				Boolean criouConta = true;

				System.out.println(menuCriarConta);
				opcao = teclado.nextInt();

				System.out.println("digite o numero para a conta");
				numeroConta = teclado.nextInt();

				switch (opcao) {
				case 1:
					cc = new ContaCorrente(numeroConta);
					if (gc.adicionar(cc) == true) {
						criouConta = true;
					} else {
						criouConta = false;
					}
					break;

				case 2:
					System.out.println("Conta especial. Digite o limite");
					int limite = teclado.nextInt();
					ce = new ContaEspecial(numeroConta, limite);
					if (gc.adicionar(ce) == true) {
						criouConta = true;
					} else {
						criouConta = false;
					}
					break;

				default:
					System.out.println("tipo desconhecido");
				}
				if (criouConta == true) {
					System.out.println("conta criada!");
				} else {
					System.out.println("conta com o n�mero informado j� existe...");
				}
			}
				break;

			case 2: {
				System.out.println("digite o numero da conta");
				numeroConta = teclado.nextInt();
				if (gc.remover(numeroConta) == true) {
					System.out.println("conta removida!");
				} else {
					System.out.println("erro! Conta n�o encontrada...");
				}
				break;
			}

			case 3: {
				System.out.println("n�mero da conta para buscar");
				numeroConta = teclado.nextInt();
				System.out.println(gc.mostrarDados(numeroConta));
				break;
			}

			case 4: {
				System.out.println("digite o n�mero da conta onde ser� feito o dep�sito");
				numeroConta = teclado.nextInt();
				System.out.println("valor do dep�sito");
				double valorDeposito = teclado.nextDouble();
				int posicao = gc.getPosicao(numeroConta);
				if (posicao < 0) {
					System.out.println("erro! conta n�o encontrada...");
				} else {
					gc.contas.get(posicao).depositar(valorDeposito);
					System.out.println("dep�sito de " + valorDeposito + " realizado");
				}
				break;
			}

			case 5: {
				System.out.println("digite o n�mero da conta que ser� feito o saque");
				numeroConta = teclado.nextInt();
				System.out.println("valor do saque");
				double valorSaque = teclado.nextDouble();
				int posicao = gc.getPosicao(numeroConta);
				if (posicao < 0) {
					System.out.println("erro! conta n�o encontrada...");
					break;
				}
				if (gc.contas.get(posicao).sacar(valorSaque)) {
					System.out.println("saque de " + valorSaque + " realizado");
				} else {
					System.out.println("O limite da conta n�o permite este saque.");
				}
				break;
			}

			case 6: {
				System.out.println("Saindo...");
				break;
			}

			default: {
				System.out.println("Op��o inv�lida!");
				break;
			}
			}
		}
	}
}