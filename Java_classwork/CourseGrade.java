import java.util.Scanner;

public class CourseGrade {

	public static void main(String... args){
	
	Scanner input = new Scanner(System.in);

		System.out.println("choosen course: \n 1. Math \n 2. Science \n 3. History \n");
		int course = input.nextInt();
			
			switch (course){
				case 1:
					System.out.print("Math: \n 1. Freshman \n 2. Sophomore \n 3. Junior \n 4. Senior \n");
					int math = input.nextInt();
							switch (math){
								case 1:
									System.out.print("Freshman");break;
								case 2:
									System.out.print("Sophomore");break;
								case 3:
									System.out.print("Junior");break;
								case 4:
									System.out.print("Senior");
			}break;
				case 2:
					System.out.print("Science: \n 1. Freshman \n 2. Sophomore \n 3. Junior \n 4. Senior \n");
					int science = input.nextInt();
							switch (science){
								case 1:
									System.out.print("Freshman");break;
								case 2:
									System.out.print("Sophomore");break;
								case 3:
									System.out.print("Junior");break;
								case 4:
									System.out.print("Senior");
			}break;
				case 3:
					System.out.print("History: \n 1. Freshman \n 2. Sophomore \n 3. Junior \n 4. Senior \n");
					int history = input.nextInt();
							switch (history){
								case 1:
									System.out.print("Freshman");break;
								case 2:
									System.out.print("Sophomore");break;
								case 3:
									System.out.print("Junior");break;
								case 4:
									System.out.print("Senior");
			}break;
		} 
	}
}