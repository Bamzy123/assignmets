public class SumNumber2 {

public static void main (String... args) {

		int[] numbers = {2,3,4,5,6,7};

		System.out.print("The sum of number is: ");

		printSumOfNumbers(numbers);
	}

public static void printSumOfNumbers(int[] sum) {

		int value = 0;
		int total = 0;

			while(value < sum.length) {

				total += sum[value];

			value++;
		}
		System.out.println(total);
	}
}