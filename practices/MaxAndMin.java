import java.util.Scanner;
public class MaxAndMin{
 public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter first number: ");
	int num1 = input.nextInt();
	
	System.out.print("Enter second number: ");
	int num2 = input.nextInt();

	if (num1 > num2){
	    System.out.print("min");
      }
	else if (num2 < num1){
	    System.out.print("max");
        }
	else {
	  System.out.print("No min and max");
       }
    }
}