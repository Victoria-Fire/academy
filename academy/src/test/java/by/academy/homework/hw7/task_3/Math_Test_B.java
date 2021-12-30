package by.academy.homework.hw7.task_3;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(TestRunner.class)
public class Math_Test_B extends Assert {

	@Test
	public void TestMax() {
		assertEquals(777, Math.max(777, 717));
	}

	@Test
	public void TestToDegrees() {
		assertEquals(45, Math.toDegrees(0.785398), 0.1);
	}
}
