package javacalc;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void test() {
		Calculator calc = new Calculator();
		int actualValue = calc.addTwoNumbers(2,2);
		System.out.println("the value of actual is " + actualValue);
		Assert.assertEquals(4, actualValue);
	}

}
