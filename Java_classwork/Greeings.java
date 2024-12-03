import java.util.Scanner;

public class Greetings{

 public static void main(String... args){
  
	Scanner input = new Scanner(System.in);

	System.out.println("Please choose one: \n 1. English \n 2. Yoruba \n 3. Igbo");
	int language = input.nextInt();


	switch(language){
		case 1:
			System.out.println("choose one:\n 1. Morning \n 2. Afernoon \n 3. Evening");
			int englshChoice = input.nextInt();
		switch(englishChoie){
			case 1:
			System.out.println("good morning in english\n good afternoon in english\n good evening in english");
				break;
		}
	
	   }
	}
}