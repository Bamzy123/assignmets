public class DuplicateValues {

public static void main (String... args) {

		int [] numbers = {1, 2, 3, 4, 3, 2, 6, 7, 8, 6, 9, 10};

		for (int number = 0; number < numbers.length; number++) {
			for (int value = number + 1; value < numbers.length; value++) {

				if (numbers[number] == numbers[value])
					System.out.print(numbers[number] + " ");
			}
		}
	}
}


