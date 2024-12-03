import java.util.Scanner;

public class Greet{

  	public static void main(String... args){

  	Scanner input = new Scanner(System.in);

	System.out.println("Can i greet you please:\n 1. To get greeting\n 2. Shut up.");
	int answer = input.nextInt();

	switch(answer){

		case 1:
		   System.out.println("Hello there!");
			break;
		case 2:
		System.out.println("okay thanks, bye!");
			break;
	}
    }
}

