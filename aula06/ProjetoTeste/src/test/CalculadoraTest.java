package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.Calculadora;

public class CalculadoraTest {
	private Calculadora c;

	@BeforeEach
	public void setup() {
		c = new Calculadora();
	}

	@Test
	public void deveRetornarASomaDosNumeros() {
//		Calculadora c = new Calculadora();
		double resultado = c.somar(10, 20);
		assertEquals(30, resultado);
	}

	@Test
	public void deveRetornarASubtracaoDosNumeros() {
//	Calculadora c = new Calculadora();
		double resultado = c.subtrair(30, 20);
		assertEquals(10, resultado);
	}

	@Test
	public void deveRetornarAmultiplicacaoDosNumeros() {
//	Calculadora c = new Calculadora();
		double resultado = c.multiplicar(10, 20);
		assertEquals(200, resultado);
	}

	@Test
	public void deveRetornarADivisaoDosNumerosQuandoDivisorDiferenteDeZero() {
//	Calculadora c = new Calculadora();
		double resultado = c.dividir(40, 20);
		assertEquals(2, resultado);
	}

	@Test
	public void deveRetornarMenosUmSeDivisorIgualZero() {
		double resultado = c.dividir(1, 0);
		assertEquals(-1, resultado);
	}
}
