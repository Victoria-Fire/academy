package by.academy.junit;

import org.junit.Assert;
import org.junit.Test;

public class SecondMathTest extends Assert  {
	
	@Test
	public void testMathSum() {
		System.out.println("testMathSum()");
		assertNotEquals(10, Calculator.getSum(3, 5));
	}

}
