package euler;

public class P10_Summation_of_primes {

	public static void main(String[] args) {
		System.out.println("Result=" + new P10_Summation_of_primes().execute(2_000_000L));
	}

	public Long execute(Long limit) {
		Long sumOfPrimes = 2L;
		for (long i = 3L; i < limit; i += 2) {
			if (isPrime(i)) {
				sumOfPrimes += i;
			}
		}
		return sumOfPrimes;
	}

	private boolean isPrime(long num) {
		if (num == 2)
			return true;
		for (long i = 2L; i < Math.sqrt(num) + 1; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

}
