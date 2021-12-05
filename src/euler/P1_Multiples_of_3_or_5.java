package euler;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class P1_Multiples_of_3_or_5 {
	/*
	 * https://projecteuler.net/problem=1
	 * 
	 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we
	 * get 3, 5, 6 and 9. The sum of these multiples is 23.
	 * 
	 * Find the sum of all the multiples of 3 or 5 below 1000.
	 * 
	 */
	static P1_Multiples_of_3_or_5 clazz = new P1_Multiples_of_3_or_5();

	public static void main(String[] args) {
		System.out.println("Result = " + clazz.execute(1000L));
		System.out.println("Result = " + clazz.execute2(1000L));
	}

	public Long execute(Long limit) {

		// Guard Clause
		if (!validatelimit(limit)) {
			return 0l;
		}

		return (long) IntStream.range(1, limit.intValue()).filter(isMultipleOf3Or5).reduce(0, Integer::sum);

	}

	private boolean validatelimit(Long limit) {
		return limit > 0 && limit < Integer.MAX_VALUE;
	}

	private IntPredicate isMultipleOf3Or5 = num -> (num % 3 == 0 || num % 5 == 0);

	// Online answers
	public Long execute2(long limit) {
		return func(limit, 3) + func(limit, 5) - func(limit, 15);
	}

	private long func(long limit, int factor) {
		return sumOfMultiples.apply(limit, factor) * factor;
	}

	private BiFunction<Long, Integer, Long> largestNumberOfSeries = (limit, factor) -> (limit - 1) / factor;
	private Function<Long, Long> sumOfSeries = N -> N * (N + 1) / 2;
	private BiFunction<Long, Integer, Long> sumOfMultiples = largestNumberOfSeries.andThen(sumOfSeries);

}
