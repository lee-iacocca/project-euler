package euler;

import org.testng.Assert;
import org.testng.annotations.Test;

public class P6_Sum_square_differenceTest {

	P6_Sum_square_difference clazz = new P6_Sum_square_difference();

	@Test
	public void executeTest() {
		Long expected = 2640L;
		Long actual = clazz.execute(10L);
		Assert.assertEquals(actual, expected);

	}

	@Test
	public void executeTest_v2() {
		Long expected = 2640L;
		Long actual = clazz.execute2(10L);
		Assert.assertEquals(actual, expected);

	}
}
