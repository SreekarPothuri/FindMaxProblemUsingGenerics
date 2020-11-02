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
		int result = maxi.maxInt(100, 20, 3);
		Assert.assertEquals(100,result);
	}
	
	@Test
	public void testMaximumAtSecondPosition_testAssertionHappy() {
		int result = maxi.maxInt(10, 20, 3);
		Assert.assertEquals(20,result);
	}
	
	@Test
	public void testMaximumAtThirdPosition_testAssertionHappy() {
		int result = maxi.maxInt(1, 22, 356);
		Assert.assertEquals(356,result);
	}
}
