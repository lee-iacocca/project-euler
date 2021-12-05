package euler.test;

import org.testng.annotations.Test;

import euler.P1_Multiples_of_3_or_5;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;

public class P1_Multiples_of_3_or_5_Test {

	private P1_Multiples_of_3_or_5 clazz;

	@BeforeClass
	public void beforeClass() {
		clazz = new P1_Multiples_of_3_or_5();
	}

	@Test
	public void test_10() {
		Long expected = 23L;
		Long actual = clazz.execute(10L);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void test_10_v2() {
		Long expected = 23L;
		Long actual = clazz.execute2(10L);
		Assert.assertEquals(actual, expected);
	}

}
