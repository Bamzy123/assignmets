public class SumNumber {

public static void main (String... args) {

		int[] numbers = {2,3,4,5,6,7};

		System.out.print("The sum of number is: ");

		printSumOfNumbers(numbers);
	}

public static void printSumOfNumbers(int[] sum) {

		int total = 0;

		for (int value = 0; value < sum.length; value++) {

			total+= sum[value];
		}
		System.out.println(total);
	}
}