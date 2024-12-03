import java.util.Scanner;

public class Triangle {

	public static void main(String... args){

	Scanner input = new Scanner(System.in);
	System.out.println("please enter a number: ");
	int number = input.nextInt();


	for (int count = 1; count <= number; count++){
		for (int value = 1; value <= count; value++){
			System.out.print("@" + " ");
			}
		System.out.println();
		}
	}
} 


int [] a = new int[4];
		int [] b = new int[4];