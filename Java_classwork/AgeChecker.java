import java.util.Scanner;
public class AgeChecker {
	public static void main(String[] args)  {
	Scanner input = new Scanner(System.in);
	for(int index = 1; index <= 20; index++)  {

		System.out.print("How old are you? Please choose an option: \n 1.50 \n 2.20 \n 3.10 \n 4. none \n");
		int age = input.nextInt();
		switch(age)  {
		case 1: System.out.println("You're matured");break;
			
		case 2: System.out.println("You're a teenager");break;
		
		case 3: System.out.println("You're a child");break;
		
		case 4: System.out.println("None of the options");break;	
		}
		
		if(age != 50 || age != 20 || age != 10)
			System.out.println("please enter ya your age");
	}

}
}