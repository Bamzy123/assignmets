public class OddNumber {

public static void main (String... args) {

		int[] numbers = {3,7,5,4,6};
		
		System.out.print("The odd number: ");

		printOddNumbers(numbers);
	}

public static void printOddNumbers(int[] value) {

		for (int digit = 0; digit < value.length; digit++) {
			
			if (value[digit] % 2 != 0){
				System.out.print(value[digit] + " ");
		}
	}
}