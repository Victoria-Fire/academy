package by.academy.junit;

import java.util.Arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(value = Parameterized.class)
public class SimpleMathTest extends Assert {

	private int valueA;
	private int valueB;
	private int expected;

	public SimpleMathTest(int valueA, int valueB, int expected) {
		this.valueA = valueA;
		this.valueB = valueB;
		this.expected = expected;
	}

	@Parameterized.Parameters(name = "{index}:multipleOf({0}*{1})={2}")
	public static Iterable<Object[]> dataForTest() {
		return Arrays.asList(new Object[][] { { 2, 3, 6 }, { 4, 5, 20 }, { 3, 6, 18 }, { 7, 8, 56 }, { 9, 8, 72 } });
	}

	@BeforeClass
	public static void init() {
		System.out.println("Запуск до всех тестов!");
	}

	@AfterClass
	public static void postInit() {
		System.out.println("Запуск после всех тестов!");
	}

	@Before
	public void before() {
		System.out.println("Запуск до тестa!");
	}

	@After
	public void after() {
		System.out.println("Запуск после тестa!");
		System.out.println();
	}

	@Test
	public void multipleOf() {
		assertEquals(expected, Calculator.getMultiple(valueA, valueB));
	}

	@Test
	public void testMathDevide() {
		System.out.println("testMathDevide()");
		assertEquals(2, Calculator.getDevide(6, 3));
	}

	@Test
	public void testMathSum() {
		System.out.println("testMathSum()");
		assertNotEquals(10, Calculator.getSum(3, 5));
	}

	@Test(expected = ArithmeticException.class)
	public void testMathDev() {
		System.out.println("testMathDev()");
		Calculator.getDevide(5, 0);
	}

	@Test(timeout = 100)
	@Ignore
	public void cycleSum() {
		System.out.println("cycleSum()");
		boolean b = true;
		while (b) {
			assertEquals(6, Calculator.getSum(2, 4));
		}
	}

	@Test
	@Ignore
	public void testFail() {
		System.out.println("testFail()");
		fail();
	}

}

// 1. Тест проверяет метод деления с помощью assertEquals
// 2. Тест проверяет метод сложения с помощью assertNotEquals
// 3. Тест проверяет метод деления, expected = ArithmeticException.class деление
// на ноль
// 4. Тест проверяет метод сложения в бесконечном цикле, тест пометить
// параметром timeout = 100
// 5. Тест, который должен закончиться неудачей.
