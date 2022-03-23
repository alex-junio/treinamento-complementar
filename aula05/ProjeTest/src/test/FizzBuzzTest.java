package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.FizzBuzz;

public class FizzBuzzTest {
	@Test
	public void deveRetornarFizzQuandoForMultiploDeTres() {
		FizzBuzz f = new FizzBuzz();

	String retorno = f.calcular(3);

	assertEquals("fizz", retorno);
		}

}


