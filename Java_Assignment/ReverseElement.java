public class ReverseElement {

public static void main (String... args) {

		int [] number = {1, 2, 3, 4, 5};

		for (int value = number.length - 1; value >= 0; value--) {

			System.out.print(number [value] + " ");
		}
	}
}

