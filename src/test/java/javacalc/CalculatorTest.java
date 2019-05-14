package javacalc;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void addTest() {
		Calculator calc = new Calculator();
		int actualValue = calc.addTwoNumbers(2,2);
		System.out.println("the value of actual is " + actualValue);
		Assert.assertEquals(4, actualValue);
	}
	
	@Test
	public void subtractTest() {
		Calculator calc = new Calculator();
		int actualValue = calc.subtract(6,2);
		System.out.println("the value of actual is " + actualValue);
		Assert.assertEquals(4, actualValue);
	}


}
