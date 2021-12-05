package euler;

public class P3_Largest_prime_factor {
	/*
	 * https://projecteuler.net/problem=3
	 * 
	 * The prime factors of 13195 are 5, 7, 13 and 29.
	 * 
	 * What is the largest prime factor of the number 600851475143 ?
	 */
	
	
	public static void main(String[] args) {
		System.out.println("Value =" + new P3_Largest_prime_factor().execute(600851475143L));

	}

	public Long execute(Long limit) {
		Long startingValue = (long) (Math.sqrt(limit) + 1);
		if (startingValue % 2 == 0) {
			startingValue++;
		}

		for (Long i = startingValue; i > 0; i -= 2) {
			if (isPrimeNumber(i) && limit % i == 0) {
				return i;
			}
		}
		return 1l;
	}

	private boolean isPrimeNumber(Long num) {
		if (num == 1 || num == 2)
			return true;

		for (Long n = 3L; n <= Math.sqrt(num); n += 2) {
			if (num % n == 0)
				return false;
		}
		return true;
	}

}
