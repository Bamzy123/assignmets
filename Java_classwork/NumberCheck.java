import java.util.Scanner;
public class NumberCheck{
 public static void main(String... args){

	Scanner input = new Scanner(System.in);

	System.out.print("Input first number: ");
	int first = input.nextInt();

	System.out.print("Input second number: ");
	int second = input.nextInt();

	System.out.print("Input three number: ");
	int three = input.nextInt();

	if (first == second && second == three){
	   System.out.print("they are equal");

	}
	else if (first != second && first != three && second != three){
	  System.out.print("they are not equal");
          }
     }

}
