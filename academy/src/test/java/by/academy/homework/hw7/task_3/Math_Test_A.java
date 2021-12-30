package by.academy.homework.hw7.task_3;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(TestRunner.class)
public class Math_Test_A extends Assert {

	@Test
	public void TestSignum() {
		assertEquals(1, Math.signum(54), 0);
		assertEquals(-1, Math.signum(-8), 0);
	}

	@Test
	public void TestSqrt() {
		assertEquals(5, Math.sqrt(25), 0);
		assertEquals(17, Math.sqrt(289), 0);
	}
}
