package euler;

import org.testng.Assert;
import org.testng.annotations.Test;

public class P10_Summation_of_primesTest {
	P10_Summation_of_primes clazz = new P10_Summation_of_primes();

	@Test
	public void executeTest() {
		Long expected = 17L;
		Long actual = clazz.execute(10L);
		Assert.assertEquals(actual, expected);
	}
}
