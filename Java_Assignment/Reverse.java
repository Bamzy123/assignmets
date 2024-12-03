public class Reverse {

public static void main (String... args) {

		int[] numbers = {2,3,4,5,6,7};

		System.out.print("The reserve list: ");

		reverse(numbers);
	}

public static void reverse(int[] value) {

		for (int digit = value.length-1; digit >= 0; digit--) {
		
			System.out.print(value[digit] + " ");
		}
	}
}