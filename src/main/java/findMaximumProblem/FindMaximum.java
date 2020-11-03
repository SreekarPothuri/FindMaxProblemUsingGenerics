package findMaximumProblem;

public class FindMaximum<T extends Comparable<T>> {

	public static <T extends Comparable<T>> T testMaximum(T... var) {
		T max = var[0];
		for (T type : var) {
			if (type.compareTo(max) > 0)
				max = type;
		}
		printValue(max);
		return max;
	}

	public static <T> void printValue(T max) {
		System.out.println(" Max: "+max);
	}

	public static void main(String[] args) {
		System.out.println("*****WELCOME TO FIND MAXIMUM PROBLEM*****");
	}
}
