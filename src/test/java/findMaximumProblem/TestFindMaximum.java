package findMaximumProblem;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import findMaximumProblem.FindMaximum;

public class TestFindMaximum {

	
	@Test
	public void testMaximumAtFirstPositionForInteger_testAssertionHappy() {
		FindMaximum<Integer> maxi = new FindMaximum<Integer>(100, 20, 3);
		Integer result = maxi.testMaximum();
		System.out.println(result);
		Assert.assertEquals(Integer.valueOf(100), result);
	}

	@Test
	public void testMaximumAtSecondPositionForInteger_testAssertionHappy() {
		FindMaximum<Integer> maxi = new FindMaximum<Integer>(10, 20, 3);
		Integer result = maxi.testMaximum();
		System.out.println(result);
		Assert.assertEquals(Integer.valueOf(20), result);
	}

	@Test
	public void testMaximumAtThirdPositionForInteger_testAssertionHappy() {
		FindMaximum<Integer> maxi = new FindMaximum<Integer>(1, 22, 356);
		Integer result = maxi.testMaximum();
		System.out.println(result);
		Assert.assertEquals(Integer.valueOf(356), result);
	}

	@Test
	public void testMaximumAtFirstPositionForFloat_testAssertionHappy() {
		FindMaximum<Float> maxi = new FindMaximum<Float>(100.08f, 22.25f, 35.6f);
		Float result = maxi.testMaximum();
		Assert.assertEquals(Float.valueOf(100.08f), result);
	}

	@Test
	public void testMaximumAtSecondPositionForFloat_testAssertionHappy() {
		FindMaximum<Float> maxi = new FindMaximum<Float>(10.0f, 222.25f, 35.6f);
		Float result = maxi.testMaximum();
		Assert.assertEquals(Float.valueOf(222.25f), result);
	}

	@Test
	public void testMaximumAtThirdPositionForFloat_testAssertionHappy() {
		FindMaximum<Float> maxi = new FindMaximum<Float>(10.0f, 22.2f, 35.6f);
		Float result = maxi.testMaximum();
		Assert.assertEquals(Float.valueOf(35.6f), result);
	}

	@Test
	public void testMaximumAtFirstPositionForString_testAssertionHappy() {
		FindMaximum<String> maxi = new FindMaximum<String>("Peach","Apple","Banana");
		String result = maxi.testMaximum();
		Assert.assertEquals("Peach", result);
	}

	@Test
	public void testMaximumAtSecondPositionForString_testAssertionHappy() {
		FindMaximum<String> maxi = new FindMaximum<String>("Apple","Peach","Banana");
		String result = maxi.testMaximum();
		Assert.assertEquals("Peach", result);
	}

	@Test
	public void testMaximumAtThirdPositionForString_testAssertionHappy() {
		FindMaximum<String> maxi = new FindMaximum<String>("Apple","Banana","Peach");
		String result = maxi.testMaximum();
		Assert.assertEquals("Peach", result);
	}
}
