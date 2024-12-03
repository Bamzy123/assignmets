import java.util.Arrays;

public class ConcatenateArray {

public static void main (String... args) {

		String[] letters = {"a", "b", "c"};

		int[] value = {1, 2, 3};

		String[] concatenateArray = concatenate(letters, value);

		System.out.print("The concatenate array: " + Arrays.toString(concatenateArray));
	}

public static String[] concatenate(String[] letters, int[] value) {

		String[] result = new String[letters.length + value.length];

		System.arraycopy(letters, 0, result, 0, letters.length);

		for (int number = 0; number < value.length; number++) {

			result[letters.length + number] = String.valueOf(value[number]);
		}
		return result;
	}
}