package by.academy.homework.hw7.task_3;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(value = Parameterized.class)
public class Test_1 extends Assert {

	private int number;
	private int expected;

	public Test_1(int number, int expected) {
		this.expected = expected;
		this.number = number;
	}

	@Parameterized.Parameters(name = "{index}: TestFactorial -> {0}! = {1}")
	public static Iterable<Integer[]> dataForTest_1() {
		return Arrays.asList(new Integer[][] { { 3, 6 }, { 9, 362880 }, { 6, 720 } });
	}

	@Test
	public void TestFactorial() {
		assertEquals(expected, Task_3.getFactorial(number));
	}
}
