public class ReverseNumber {

public static void main(String... args) {

	int [] number = new int[10];

	for (int value = 0; value < number.length; value++) {
		number[value] = value + 1;
	}
	for (int value = number.length - 1; value >= 0; value--) {
            System.out.print(number[value] + " ");

		}

	}
}