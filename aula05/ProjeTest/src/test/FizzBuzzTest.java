package test;

import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
	@Test
	public void deveRetornarFizzQuandoForMultiploDeTres() {
		FizzBuzz f = new FizzBuzz();

	public String retorno = f.calcular();

	assertEquals(3, retorno);
		}

}


