public class DuplicateElement {

public static void main (String... args) {

		int [] value = {1, 2, 3, 2, 3, 4};
	
		for (int number = 0; number < value.length; number++) {
			for (int digit = number + 1; digit < value.length; digit++) {

				if (value [number] == value [digit])

					System.out.print(value [number] + " ");
			}
		}
	}
}
