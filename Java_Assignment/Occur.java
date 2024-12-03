public class Occur {

public static void main (String... agrs) {

		int[] numbers = {2,3,4,5,6,6,7,4};

		System.out.print("The occured number is: ");

		result(numbers);
	}

public static void result(int[] value) {

		for (int digit = 0; digit < value.length; digit++) {
			for (int number = digit + 1; number < value.length; number++) {

				if (value[digit] == value[number])
				System.out.print(value[digit] + " ");
			}
		}
	}
}