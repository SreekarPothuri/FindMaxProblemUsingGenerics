package findMaximumProblem;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import findMaximumProblem.FindMaximum;

public class TestFindMaximum {

	
	@Test
	public void testMaximumAtFirstPositionForInteger_testAssertionHappy() {
		FindMaximum<Integer> maxi = new FindMaximum<Integer>();
		Integer result = maxi.testMaximum(100, 20, 3);
		Assert.assertEquals(Integer.valueOf(100), result);
	}

	@Test
	public void testMaximumAtSecondPositionForInteger_testAssertionHappy() {
		FindMaximum<Integer> maxi = new FindMaximum<Integer>();
		Integer result = maxi.testMaximum(10, 20, 3);
		Assert.assertEquals(Integer.valueOf(20), result);
	}

	@Test
	public void testMaximumAtThirdPositionForInteger_testAssertionHappy() {
		FindMaximum<Integer> maxi = new FindMaximum<Integer>();
		Integer result = maxi.testMaximum(1, 22, 356);
		Assert.assertEquals(Integer.valueOf(356), result);
	}

	@Test
	public void testMaximumAtFourthPositionForInteger_testAssertionHappy() {
		FindMaximum<Integer> maxi = new FindMaximum<Integer>();
		Integer result = maxi.testMaximum(1, 22, 356, 1000);
		Assert.assertEquals(Integer.valueOf(1000), result);
	}
	
	@Test
	public void testMaximumAtFirstPositionForFloat_testAssertionHappy() {
		FindMaximum<Float> maxi = new FindMaximum<Float>();
		Float result = maxi.testMaximum(100.08f, 22.25f, 35.6f);
		Assert.assertEquals(Float.valueOf(100.08f), result);
	}

	@Test
	public void testMaximumAtSecondPositionForFloat_testAssertionHappy() {
		FindMaximum<Float> maxi = new FindMaximum<Float>();
		Float result = maxi.testMaximum(10.0f, 222.25f, 35.6f);
		Assert.assertEquals(Float.valueOf(222.25f), result);
	}

	@Test
	public void testMaximumAtThirdPositionForFloat_testAssertionHappy() {
		FindMaximum<Float> maxi = new FindMaximum<Float>();
		Float result = maxi.testMaximum(10.0f, 22.2f, 35.6f);
		Assert.assertEquals(Float.valueOf(35.6f), result);
	}

	@Test
	public void testMaximumAtFourthPositionForFloat_testAssertionHappy() {
		FindMaximum<Float> maxi = new FindMaximum<Float>();
		Float result = maxi.testMaximum(10.0f, 22.2f, 35.6f, 93.5f);
		Assert.assertEquals(Float.valueOf(93.5f), result);
	}

	@Test
	public void testMaximumAtFirstPositionForString_testAssertionHappy() {
		FindMaximum<String> maxi = new FindMaximum<String>();
		String result = maxi.testMaximum("Peach","Apple","Banana");
		Assert.assertEquals("Peach", result);
	}

	@Test
	public void testMaximumAtSecondPositionForString_testAssertionHappy() {
		FindMaximum<String> maxi = new FindMaximum<String>();
		String result = maxi.testMaximum("Apple","Peach","Banana");
		Assert.assertEquals("Peach", result);
	}

	@Test
	public void testMaximumAtThirdPositionForString_testAssertionHappy() {
		FindMaximum<String> maxi = new FindMaximum<String>();
		String result = maxi.testMaximum("Apple","Banana","Peach","");
		Assert.assertEquals("Peach", result);
	}
	
	@Test
	public void testMaximumAtFifthPositionForString_testAssertionHappy() {
		FindMaximum<String> maxi = new FindMaximum<String>();
		String result = maxi.testMaximum("Apple","Banana","Peach","PineApple","Strawberry");
		Assert.assertEquals("Strawberry", result);
	}
}
