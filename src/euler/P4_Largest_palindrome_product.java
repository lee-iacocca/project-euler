package euler;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class P4_Largest_palindrome_product {

	/*
	 * https://projecteuler.net/problem=4 Largest palindrome product A palindromic
	 * number reads the same both ways. The largest palindrome made from the product
	 * of two 2-digit numbers is 9009 = 91 × 99.
	 * 
	 * Find the largest palindrome made from the product of two 3-digit numbers.
	 */

	public static void main(String[] args) {
		System.out.println("Result=" + new P4_Largest_palindrome_product().execute(100L, 999L));
	}

	public Long execute(Long lowerLimit, Long upperLimit) {
		// Guard clause
		if (upperLimit <= lowerLimit)
			return -1L;

		Set<Long> palindromeSet = new HashSet<>();
		// adding -1 to denote error
		palindromeSet.add(-1L);

		return calculateLargestPalindromeInRange(lowerLimit, upperLimit, palindromeSet);
	}

	private Long calculateLargestPalindromeInRange(Long lowerLimit, Long upperLimit, Set<Long> palindromeSet) {
		for (long i = upperLimit; i >= lowerLimit; i--) {
			for (long j = i; j >= lowerLimit; j--) {
				if (isPalindrome(i * j)) {
					palindromeSet.add(i * j);
				}
			}
		}

		return Collections.max(palindromeSet);
	}

	private boolean isPalindrome(long number) {
		return number == calculateReversedNumber(number);
	}

	private long calculateReversedNumber(long number) {
		long reversedNumber = 0L;
		while (number > 0) {
			reversedNumber = reversedNumber * 10 + number % 10;
			number /= 10;
		}
		return reversedNumber;
	}

	// Online answers
	public Long execute2(Long lowerLimit, Long upperLimit) {
		long max = -1L;

		for (long i = upperLimit; i >= lowerLimit; i--) {
			// Skips unnecessary steps
			if (max >= i * upperLimit) {
				break;
			}
			
			for (long j = upperLimit; j >= i; j--) {
				long p = i * j;
				if (max < p && isPalindrome(p)) {
					max = p;
				}
			}
		}
		return max;

	}
}
