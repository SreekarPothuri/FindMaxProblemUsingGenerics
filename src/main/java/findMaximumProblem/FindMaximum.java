package findMaximumProblem;

public class FindMaximum {

	public int compare(Integer o1, Integer o2) {
		return o1.compareTo(o2);
	}

	public float compare(Float o1, Float o2) {
		return o1.compareTo(o2);
	}

	public int compare(String o1, String o2) {
		return o1.compareTo(o2);
	}

	public static <T extends Comparable<T>> T max(T a, T b, T c) {
		T max = a;
		if (b.compareTo(a) > 0)
			max = b;
		if (c.compareTo(b) > 0)
			max = c;
		return max;
	}

	public static void main(String[] args) {
		System.out.println("*****WELCOME TO FIND MAXIMUM PROBLEM*****");
		System.out.println("Max int: " + max(777, 8888, 200000));
		System.out.println("Max float: " + max(7.056f, 88.88f, 20.000f));
		System.out.println("Max String: " + max("Apple", "Peach", "Banana"));
	}
}
