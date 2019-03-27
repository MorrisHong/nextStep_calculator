package calculatorTest;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import calculator.Calculator;

public class CalculatorTest {
	private Calculator cal;
	
	@Before
	public void setup() {
		cal = new Calculator();
	}
	
	@Test
	public void add() {
		assertEquals(6, cal.add(3, 3));
		System.out.println("add()");
	}
	
	@Test
	public void subtract() {
		assertEquals(3, cal.subtract(6, 3));
		System.out.println("substract()");
	}
	
	@After
	public void teardown() {
		System.out.println("teardown()");
	}

}
