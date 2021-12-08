package euler;

public class P9_Special_Pythagorean_triplet {
	/*
	 * https://projecteuler.net/problem=9 A Pythagorean triplet is a set of three
	 * natural numbers, a < b < c, for which,
	 * 
	 * a2 + b2 = c2 For example, 32 + 42 = 9 + 16 = 25 = 52.
	 * 
	 * There exists exactly one Pythagorean triplet for which a + b + c = 1000. Find
	 * the product ab
	 */
	public static void main(String[] args) {
		System.out.println("Result=" + new P9_Special_Pythagorean_triplet().execute(1000));
	}

	public int execute(int sum) {

		for (int a = 1; a < sum; a++) {
			for (int b = a + 1; b < sum; b++) {
				int c = sum - a - b;

				if (a >= b || b >= c || a >= c)
					continue;

				if ((a * a + b * b) == (c * c))
					return a * b * c;
			}
		}

		return 0;
	}

}
