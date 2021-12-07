package euler;

import org.testng.Assert;
import org.testng.annotations.Test;

public class P5_Smallest_multipleTest {

	P5_Smallest_multiple clazz = new P5_Smallest_multiple();

	@Test
	public void execute10() {
		Long expected = 2520L;
		Long actual = clazz.execute(10L);
		Assert.assertEquals(actual, expected);
	}

	@Test
	public void execute20() {
		Long expected = 232792560L;
		Long actual = clazz.execute(20L);
		Assert.assertEquals(actual, expected);
	}
}
