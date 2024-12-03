import java.util.Scanner;

public class Greeting{

 public static void main(String... args){
  
	Scanner input = new Scanner(System.in);

	System.out.println("Please choose one: \n 1. English \n 2. Yoruba \n 3. Igbo");
	int lang = input.nextInt();


	switch(lang){
	    case 1:
		System.out.println("Hello there!");
			break;

	    case 2:
		System.out.println("Ba wo ni");
			break;

	    case 3:
		System.out.println("Ututu oma");
	}
    }
}