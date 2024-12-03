import java.util.Scanner;

public class Greetings{

 public static void main(String... args){
  
	Scanner input = new Scanner(System.in);

	System.out.println("Please choose one: \n 1. English \n 2. Yoruba \n 3. Igbo");
	int language = input.nextInt();


	switch(language){
		case 1:
			System.out.println("choose one:\n 1. Morning \n 2. Afernoon \n 3. Evening");
			int englishChoice = input.nextInt();
		switch(englishChoice){
			case 1:
			System.out.println("good morning to you");
				break;
			case 2:
			System.out.println("good afternoon to you");
				break;
			case 3:
			System.out.println("good evening to you");}
				break;

	case 2:
			System.out.println("choose one:\n 1. Aaaro \n 2. Osan \n 3. Irole");
			int yorubaChoice = input.nextInt();
		switch(yorubaChoice){
			case 1:
			System.out.println("e Aaaro");
				break;
			case 2:
			System.out.println("e ka so");
				break;
			case 3:
			System.out.println("e kuro le");}
				break;
    case 3:
			System.out.println("choose one:\n 1. Ututu \n 2. Ehihe \n 3. Abali");
			int igboChoice = input.nextInt();
		switch(igboChoice){
			case 1:
			System.out.println("Ututu oma");
				break;
			case 2:
			System.out.println("Ehihe oma");
				break;
			case 3:
			System.out.println("Abali oma");}
				break;

	   }
	}
}