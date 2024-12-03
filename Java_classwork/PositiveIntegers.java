import java.util.Scanner;

public class PositiveIntegers {

	public static void main(String... args){

	Scanner input = new Scanner(System.in);

	int sum = 0;
	int userNumber;

	System.out.println("enter a positive number or -1 to stop: ");
        userNumber = input.nextInt();

	while (userNumber != -1){

			if (userNumber > 0)

				sum += userNumber;

			System.out.println("enter a positive number or -1 to stop: ");
			userNumber = input.nextInt();
		}
		System.out.println("Total sum of positive number is: " + sum);
	}
}