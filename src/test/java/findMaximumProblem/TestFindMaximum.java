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
	public void testMaximumAtFirstPositionForInteger_testAssertionHappy() {
		int result = maxi.max(100, 20, 3);
		Assert.assertEquals(100, result);
	}

	@Test
	public void testMaximumAtSecondPositionForInteger_testAssertionHappy() {
		int result = maxi.max(10, 20, 3);
		Assert.assertEquals(20, result);
	}

	@Test
	public void testMaximumAtThirdPositionForInteger_testAssertionHappy() {
		int result = maxi.max(1, 22, 356);
		Assert.assertEquals(356, result);
	}

	@Test
	public void testMaximumAtFirstPositionForFloat_testAssertionHappy() {
		float result = maxi.max(100.08f, 20.25f, 3.56f);
		Assert.assertEquals(result, 100.00, 0.08);
	}

	@Test
	public void testMaximumAtSecondPositionForFloat_testAssertionHappy() {
		float result = maxi.max(10.0f, 222.256f, 35.6f);
		Assert.assertEquals(result, 222.006, 0.25);
	}

	@Test
	public void testMaximumAtThirdPositionForFloat_testAssertionHappy() {
		float result = maxi.max(10.0f, 22.2f, 35.6f);
		Assert.assertEquals(result, 35.00, 0.6);
	}

	@Test
	public void testMaximumAtFirstPositionForString_testAssertionHappy() {
		String result = maxi.max("Srinu", "Latha", "Sree");
		Assert.assertEquals("Srinu", result);
	}

	@Test
	public void testMaximumAtSecondPositionForString_testAssertionHappy() {
		String result = maxi.max("Latha", "Srinu", "Sree");
		Assert.assertEquals("Srinu", result);
	}

	@Test
	public void testMaximumAtThirdPositionForString_testAssertionHappy() {
		String result = maxi.max("Sree", "Latha", "Srinu");
		Assert.assertEquals("Srinu", result);
	}
}
