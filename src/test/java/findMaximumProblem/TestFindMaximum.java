package findMaximumProblem;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import findMaximumProblem.FindMaximum;

public class TestFindMaximum {

	static FindMaximum maxi;
	
	@BeforeClass
	public static void findMaximumObj() {
		maxi = new FindMaximum();
		System.out.println("In Before class");
	}

	@Test
	public void testMaximumAtFirstPosition_testAssertionHappy() {
		Integer result = maxi.maxInt(100, 20, 3);
		Assert.assertEquals(Integer.valueOf(100),result);
	}
	
	@Test
	public void testMaximumAtSecondPosition_testAssertionHappy() {
		Integer result = maxi.maxInt(10, 20, 3);
		Assert.assertEquals(Integer.valueOf(20),result);
	}
	
	@Test
	public void testMaximumAtThirdPosition_testAssertionHappy() {
		Integer result = maxi.maxInt(1, 22, 356);
		Assert.assertEquals(Integer.valueOf(356),result);
	}
}
