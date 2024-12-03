import java.util.Scanner;

public class PrimeNumber {

public static int[] getprimes (int number) {

		int[] temp = new int[number];

		int[] count = 0;

		for (int num = 2, num < number; num++) {
			Boolean isprime = true;
			
			for (int divisor = 2; divisor <= math.sqrt(num); divisor++) {
				if (num % divisor == 0) {
					isprime = false;
					break;
				}
			}
			if (isprime) {
				temp[count] = num;
			count++;
			}
		}
		int[] primes = new int[count];

	}
}