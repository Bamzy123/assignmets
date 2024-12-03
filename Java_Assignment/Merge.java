
import java.util.Arrays;

public class Merge {

public static void main (String... args) {

		int [] number = {1, 3, 5}; 

		int [] digit = {2, 4, 6};

		int numberOne = number.length;

		int digitOne = digit.length;

		int value = numberOne + digitOne;

		int [] value1 = new int [value];

		for (int i = 0; i < number.length; i++) {

			Arrays.sort(value1);

			System.out.println(Arrays.toString(value1));
		}

		
	}
}