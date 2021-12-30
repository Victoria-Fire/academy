package by.academy.homework.hw7.task_3;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(value = Parameterized.class)
public class Test_2 extends Assert {

	private int number;
	private int degree;
	private int expected;

	public Test_2(int number, int degree, int expected) {
		this.number = number;
		this.degree = degree;
		this.expected = expected;
	}

	@Parameterized.Parameters(name = "{index}: TestDegreeOfNumber -> {0} в степени {1} = {2}")
	public static Iterable<Integer[]> dataForTest_2() {
		return Arrays.asList(new Integer[][] { { 5, 2, 25 }, { 6, 5, 7776 }, { 2, 8, 256 } });
	}

	@Test
	public void TestDegreeOfNumber() {
		assertEquals(expected, Task_3.getDegreeOfNumber(number, degree));
	}
}
