package euler;

import org.testng.Assert;
import org.testng.annotations.Test;

public class P9_Special_Pythagorean_tripletTest {
	P9_Special_Pythagorean_triplet clazz = new P9_Special_Pythagorean_triplet();

	@Test
	public void executeTest() {
		int expected = 60;
		int actual = clazz.execute(3 + 4 + 5);
		Assert.assertEquals(actual, expected);
	}
}
