import java.util.Scanner;
public class GreatestNumber{
 public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	int largest = 0;

	System.out.print("Enter first number: ");
	int numberOne = input.nextInt();
	
	System.out.print("Enter second number: ");
	int numberTwo = input.nextInt();

	System.out.print("Enter third number: ");
	int numberThree = input.nextInt();

	if (numberOne > numberTwo && numberThree){
	   largest = numberOne;
 	}
	else if (numberTwo > numberOne && numberThree){
	   largest = numberTwo;
	}
	else if (numberThree > numberOne && numberTwo){
	   largest = numberThree;
	}
System.out.print(largest);
    }
}
