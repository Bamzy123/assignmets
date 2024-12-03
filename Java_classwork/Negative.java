import java.util.Scanner;
public class Negative{
 public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	int number = -1;
	int count = 5;
	System.out.print("Input a number");
	int num = input.nextInt();
  
	while (num > number){
	    System.out.print("positive");
	    count++;
	}
	if (num < number){
	   System.out.print("negative");
	}
	else if (num == number){
	   System.out.print("zero");
	}
   }
}