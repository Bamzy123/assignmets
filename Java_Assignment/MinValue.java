public class MinValue {

public static void main (String... args) {

		int [] number = {4, 2, 9, 1, 6};

		int min = number [0];

		for (int digit = 0; digit < number.length; digit++) {

			if (number [digit] < min)
				min = number [digit];
		}
		System.out.print("The minimum value is: " + min);
	}
}