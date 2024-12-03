import java.util.Scanner;

public class Rank {

	public static void main(String... args){

	Scanner input = new Scanner(System.in);

	System.out.println("Enter ya rank between 1 - 4: ");
	int rank = input.nextInt();

		switch(rank){
			case 1:
				System.out.print("Gold Medal");break;
			case 2:
				System.out.print("Silver Medal");break;
			case 3:
				System.out.print("Bronze Medal");break;
			case 4:
				System.out.print("Participant Ribbon");
		}
	}
}