package euler;

import org.testng.Assert;
import org.testng.annotations.Test;

public class P8_Largest_product_in_a_seriesTest {
	P8_Largest_product_in_a_series clazz = new P8_Largest_product_in_a_series();

	@Test
	public void executeTest() {
		Long expected = 5832L;
		Long actual = clazz.execute(4);
		Assert.assertEquals(actual, expected);
	}
}
