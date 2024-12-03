public class PrimeNumbers {

    public static int[] getPrimes(int n) {
        // Temporary array to store potential prime numbers
        int[] tempPrimes = new int[n];
        int count = 0;

        for (int num = 2; num <= n; num++) {
            boolean isPrime = true;

            for (int divisor = 2; divisor <= Math.sqrt(num); divisor++) {
                if (num % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                tempPrimes[count] = num;
                count++;
            }
        }

        // Create an array of the exact size of prime numbers
        int[] primes = new int[count];
        System.arraycopy(tempPrimes, 0, primes, 0, count);

        return primes;
    }

    public static void main(String[] args) {
        int n = 50; // Define the upper limit
        int[] primes = getPrimes(n);

        // Print the prime numbers
        System.out.print("Prime numbers up to " + n + ": ");
        for (int prime : primes) {
            System.out.print(prime + " ");
        }
    }
}
