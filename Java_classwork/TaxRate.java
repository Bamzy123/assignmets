
import java.util.Scanner;

public class TaxRate {

public static void main(String... args){

	Scanner input = new Scanner(System.in);
	
	int first = 987;
	int second = 40125;
	int third = 85526;

	System.out.print("Please input your annual income:$ ");
	int annual = input.nextInt();

		if (annual <= first)
			System.out.println("10%");

		else if (annual <= second)
			System.out.println("12%");

		else if (annual <= third)
			System.out.println("22%");

		else {
			System.out.println("24%");
		}
	}
}