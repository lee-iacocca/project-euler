package euler;

public class P6_Sum_square_difference {
	/*
	 * https://projecteuler.net/problem=6
	 * 
	 * Sum square difference
	 */

	public static void main(String[] args) {
		System.out.println("Result=" + new P6_Sum_square_difference().execute(100L));
		System.out.println("Result=" + new P6_Sum_square_difference().execute2(100L));
	}

	public Long execute(Long limit) {
		Long sum = 0L;
		Long sumOfSquares = 0L;
		for (long i = 1; i <= limit; i++) {
			sum += i;
			sumOfSquares += i * i;
		}
		return sum * sum - sumOfSquares;
	}

	// Online answers

	public Long execute2(Long limit) {
		Long sum = limit * (limit + 1) / 2; // N(N+1)/2
		Long squareOfSums = sum * sum;

		Long sumOfSquares = limit * (limit + 1) * (2 * limit + 1) / 6;// N(N+1)(2N+1)/6

		return squareOfSums - sumOfSquares;
	}

}
