package projetoveiculo;
import java.util.Scanner;

public class AppVeiculo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String marca, modelo;
		double consumo;
		System.out.println("Qual a marca?");
		marca = teclado.nextLine();
		System.out.println("Qual o modelo?");
		modelo = teclado.nextLine();
		System.out.println("Quantos quilômetros por litro?");
		consumo = teclado.nextDouble();

		Veiculo v1 = new Veiculo(marca, modelo, consumo);
		v1.mostrar();
		teclado.close();
	}
}
