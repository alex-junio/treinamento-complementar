package main;

public class FizzBuzz {
	public String calcular(int numero) {
		if (numero % 3 == 0) {
			return "fizz";
		}
		return "" + numero;
	}
}
