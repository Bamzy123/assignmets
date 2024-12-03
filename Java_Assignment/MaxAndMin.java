public class MaxAndMin {

	public static void main (String... args) {
	
	int [] number = {10, 12, 2, 20, 30};

	int max = number [0];
	int min = number [0];

	for (int value = 0; value < number.length; value++) {

			if (number [value] > max)
				max = number [value];

			else if (number [value] < min)
				min = number [value];
		}
	System.out.println ("The maximum value is: " + max);
	System.out.println ("The minimum value is: " + min);
	}
}