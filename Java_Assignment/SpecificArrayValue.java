public class SpecificArrayValue {
public static void main (String... args) {

		int [] value = {4, 6, 9, 100, 3, 5, 2};

		int specificValue = 100;

		for (int number = 0; number < value.length; number++) {

			if (value [number] == specificValue) {
				System.out.println (specificValue + " is found in the array");
			}
		}
	}
}