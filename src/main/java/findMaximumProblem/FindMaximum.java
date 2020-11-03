package findMaximumProblem;

public class FindMaximum <T extends Comparable<T>> {

	T a;
	T b;
	T c;
	
	public FindMaximum(T a, T b, T c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public T testMaximum() {
		return (T) FindMaximum.testMaximum(a, b, c);
	}

	public static <T extends Comparable<T>> T testMaximum(T a, T b, T c) {
		T max = (T) a;
		if (b.compareTo(max) > 0) {
			max = (T) b;
		}
		if (c.compareTo(max) > 0) {
			max = (T) c;
		}
		return max;
	}

	public static void main(String[] args) {
		System.out.println("*****WELCOME TO FIND MAXIMUM PROBLEM*****");
	}
}
