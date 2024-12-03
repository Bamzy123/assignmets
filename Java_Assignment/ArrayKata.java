public class ArrayKata {

public static void main(String... args) {

		int[] value = {3,4,5,6,7,2,9,6};

		int result = largest(value);

		System.out.println("The largest number is: " + result);
	}
public static int largest(int[] numbers) {

		int largest = numbers[0];

		for (int digit = 0; digit < numbers.length; digit++) {

			if (numbers[digit] > largest) {
				largest = numbers[digit];
			}
		}
		return largest; 
	}
}