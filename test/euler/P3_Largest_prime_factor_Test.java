package euler;

import org.testng.annotations.Test;

import euler.P3_Largest_prime_factor;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;

public class P3_Largest_prime_factor_Test {

	P3_Largest_prime_factor clazz;

	@BeforeClass
	public void beforeClass() {
		clazz = new P3_Largest_prime_factor();
	}

	@Test
	public void test_13195() {
		Long expected = 29L;
		Long actual = clazz.execute(13195l);
		Assert.assertEquals(actual, expected);

	}

}
