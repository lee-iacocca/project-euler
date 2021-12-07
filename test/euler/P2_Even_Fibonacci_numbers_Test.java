package euler;

import org.testng.annotations.Test;

import euler.P2_Even_Fibonacci_numbers;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;

public class P2_Even_Fibonacci_numbers_Test {

	private P2_Even_Fibonacci_numbers clazz;

	@BeforeClass
	public void beforeClass() {
		clazz = new P2_Even_Fibonacci_numbers();
	}

	@Test
	public void test_55() {
		Long expected = 2 + 8 + 34L;
		Long actual = clazz.execute(55L);
		Assert.assertEquals(actual, expected);

	}

	@Test
	public void test_4Million() {
		Long expected = 4613732L;
		Long actual = clazz.execute(4_000_000L);
		Assert.assertEquals(actual, expected);

	}

	@Test
	public void test_55_v2() {
		Long expected = 2 + 8 + 34L;
		Long actual = clazz.execute2(55L);
		Assert.assertEquals(actual, expected);

	}

	@Test
	public void test_4Million_v2() {
		Long expected = 4613732L;
		Long actual = clazz.execute2(4_000_000L);
		Assert.assertEquals(actual, expected);

	}

}
