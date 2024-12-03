public class MaxValue {

public static void main (String... args) {

		int values [] = {1, 5, 2, 8, 3};

		int max = values [0];

		for (int digit = 0; digit < values.length; digit++) {

			if (values [digit] > max)
				max = values [digit];
		}
		System.out.print("The maximum value is: " + max);
	}
}

