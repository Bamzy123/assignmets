public class SumNumber1 {

public static void main (String... args) {

		int[] numbers = {2,3,4,5,6,7};

		System.out.print("The sum of number is: ");

		printSumOfNumbers(numbers);
	}

public static void printSumOfNumbers(int[] sum) {

		int total = 0;
		int value = 0;

			do {

				total += sum[value];

			value++;
		}
		while(value < sum.length);
		System.out.println(total);
	}
}