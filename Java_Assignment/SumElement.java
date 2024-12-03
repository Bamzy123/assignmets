public class SumElement {

public static void main (String... args) {

		int [] numbers = {1, 2, 3, 4, 5};

		int sum = 0;

		for (int digit = 0; digit < numbers.length; digit++) {

			sum+= numbers [digit];
		}
		System.out.print("The sum of the element is: " + sum);
	}
}