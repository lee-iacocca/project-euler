package euler;

import org.testng.Assert;
import org.testng.annotations.Test;

public class P7_10001st_primeTest {
	P7_10001st_prime clazz = new P7_10001st_prime();

	@Test
	public void executeTest() {
		Long expected = 13L;
		Long actual = clazz.execute(6);
		Assert.assertEquals(actual, expected);
	}
}
