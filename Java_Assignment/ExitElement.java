public class ExitElement {

public static void main (String... args) {

		int [] number = {10, 20, 30, 40, 50};

		int exitingElement = 20;

		for (int value = 0; value < number.length; value++) {

			if (number [value] == exitingElement) {

				System.out.println("True");
			}
		}
	}
}