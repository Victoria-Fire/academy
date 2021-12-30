package by.academy.homework.hw7.task_3;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(value = Parameterized.class)
public class Test_3 extends Assert {

	private int number;
	private int percent;
	private double expected;

	public Test_3(int number, int percent, double expected) {
		this.number = number;
		this.percent = percent;
		this.expected = expected;
	}

	@Parameterized.Parameters(name = "{index}: TestPercentageOfNumber -> {1}% от числа {0} = {2}")
	public static Iterable<Object[]> dataForTest_3() {
		return Arrays.asList(new Object[][] { { 80, 30, 24 }, { 334, 13, 43.42 }, { 963, 23, 221.49 } });
	}

	@Test
	public void TestPercentageOfNumber() {
		assertEquals(expected, Task_3.getPercentageOfNumber(number, percent), 0.50);
	}
}
