package teste2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TesteCalculadora {
	
	private Calculadora calc;
	
	@BeforeEach
	
	public void setUp() {
		calc = new Calculadora();
		
	}
	
	@Test
	
	public void testSubtrair() {
		assertEquals(2, calc.subtrair(5, 3));
		assertEquals(-8, calc.subtrair(-5, 3));
		
	}
	
	@Test
	public void testMultiplicar() {
		assertEquals(15, calc.multiplicar(5, 3));
		assertEquals(-15, calc.multiplicar(-5, 3));
	}
	
	@Test
	public void testDividirPorZero() {
		 assertThrows(ArithmeticException.class, () -> calc.dividir(5, 0));
		
	}
	
	@Test
	public void testPotenciar() {
		assertEquals(8, calc.potenciar(2, 3));
		assertEquals(1, calc.potenciar(5, 0));
	}

}
