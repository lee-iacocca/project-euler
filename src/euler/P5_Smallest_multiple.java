package euler;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.LongStream;

public class P5_Smallest_multiple {

	/*
	 * https://projecteuler.net/problem=5
	 * 
	 * Smallest multiple 2520 is the smallest number that can be divided by each of
	 * the numbers from 1 to 10 without any remainder.
	 * 
	 * What is the smallest positive number that is evenly divisible by all of the
	 * numbers from 1 to 20?
	 */
	public static void main(String[] args) {
		System.out.println("Result=" + new P5_Smallest_multiple().execute(20L));
	}

	public Long execute(Long limit) {
		long lcm = 1;
		for (long i = limit; i > 1; i--) {
			lcm = getLcmOf(i, lcm);
		}
		return lcm;
	}

	private long getLcmOf(long a, long b) {
		long lcm = (a > b) ? a : b;
		while (true) {
			if ((lcm % a == 0) && (lcm % b == 0)) {
				return lcm;
			} else {
				lcm++;
			}
		}
	}
}
