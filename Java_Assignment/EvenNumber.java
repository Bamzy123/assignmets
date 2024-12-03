public class EvenNumber {

public static void main (String... args) {

		int[] numbers = {3,8,5};

		int result = even(numbers);

		System.out.print("The even number is: " + result);
	}

public static int even(int[] value) {

		int even = value[0];

		for (int digit = 0; digit < value.length; digit++) {

			if (value[digit] % 2 == 0) {
				even = value[digit];
			}
		}
		return even;
	}
}