
import java.util.Scanner;

public class SumIntegers {

public static void main (String... args) {

Scanner input = new Scanner(System.in);

	for (int index = 1; index <= 10; index++) {

		System.out.println ("Enter ya number: ");
		int number = input.nextInt();

		if (number >= 50) {
			System.out.println("You have been prompted!!!");
		}
	}
}
}

