import java.util.Scanner;

public class EligibleCheck {

	public static void main(String... args){

	Scanner input = new Scanner(System.in);

	int vote = 16;
	int drive = 18;
	int drink = 21;

		System.out.print("Enter ya age: ");
		int userAge = input.nextInt();

			if (userAge >= drive)
				System.out.println("You are eligible");

			else if (userAge >= vote)
				System.out.println("You are eligible");

			else if (userAge >= drink)
				System.out.println("You are eligible");

	}
}