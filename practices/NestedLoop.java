import java.util.Scanner;

public class NestedLoop {

public static void main (String... args) {

Scanner input = new Scanner (System.in);

	int Passed = 0;
	int failed = 0;
	int score = 1;

	while (score <= 5) {
		
			System.out.println("Enter ya subject: ");
			int subject = input.nextInt();

			

			if (subject >= 50) 
				subject = passed;

			score++;
		
	}
	System.out.print("number of passed " + subject); 
}
}