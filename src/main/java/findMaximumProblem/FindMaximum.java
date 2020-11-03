package findMaximumProblem;

public class FindMaximum {

	public int compare(Integer o1, Integer o2) {
		return o1.compareTo(o2);
	}

	public float compare(Float o1, Float o2) {
		return o1.compareTo(o2);
	}

	public static int maxInt(Integer a, Integer b, Integer c) {
		Integer max = a;
		if (b.compareTo(max) > 0)
			max = b;
		if (c.compareTo(max) > 0)
			max = c;
		return max;
	}

	public static float maxFloat(Float a, Float b, Float c) {
		Float max = a;
		if (b.compareTo(max) > 0)
			max = b;
		if (c.compareTo(max) > 0)
			max = c;
		return max;
	}

	public static void main(String[] args) {
		System.out.println("*****WELCOME TO FIND MAXIMUM PROBLEM*****");
		System.out.println("Max int: " + maxInt(777, 8888, 200000));
		System.out.println("Max float: " + maxFloat(7.056f, 88.88f, 20.000f));
	}
}
