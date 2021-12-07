package euler;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;

public class P4_Largest_palindrome_productTest {

	P4_Largest_palindrome_product clazz = new P4_Largest_palindrome_product();

	@Test
	public void twoDigitNumberTest() {
		Long expected = 9009L;
		Long actual = clazz.execute(10L, 99L);
		Assert.assertEquals(actual, expected);
	}

	@Test
	public void twoDigitNumberTest_Fail() {
		Long expected = -1L;
		Long actual = clazz.execute(99L, 10L);
		Assert.assertEquals(actual, expected);
	}

	@Test
	public void twoDigitNumberTest_v2() {
		Long expected = 9009L;
		Long actual = clazz.execute2(10L, 99L);
		Assert.assertEquals(actual, expected);
	}

	@Test
	public void twoDigitNumberTest_Fail_v2() {
		Long expected = -1L;
		Long actual = clazz.execute2(99L, 10L);
		Assert.assertEquals(actual, expected);
	}
}
