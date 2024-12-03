import java.util.Scanner;

public class AgeCheck {

	public static void main(String... args){

	Scanner input = new Scanner(System.in);

	int child = 12;
	int teen = 17;
	
	System.out.print("Input your age: ");
	int age = input.nextInt();

		if (age <= child)
			System.out.println("child");

		else if (age <= teen)
			System.out.println("teen");

		else{
			System.out.println("adult");
		}
	}
}