import java.util.Scanner;

public class MenuSelection {

	public static void main(String... args){

	Scanner input = new Scanner(System.in);

 		System.out.println("Dessert: \n 1. ice cream \n 2. sundae \n 3. shake \n");
		int dessert = input.nextInt();
				switch (dessert){
					case 1:
						System.out.print("Ice cream: \n 1. chocolate \n 2. vanillia \n 3. strawberry \n");
						int iceCream = input.nextInt();
								switch (iceCream){
									case 1:
										System.out.print("chocolate");break;
									case 2:
										System.out.print("vanillia");break;
									case 3:
										System.out.print("strawberry");
			}break;
					case 2:
						System.out.print("Sundae: \n 1. chocolate \n 2. vanillia \n 3. strawberry \n");
						int sundae = input.nextInt();
								switch (sundae){
									case 1:
										System.out.print("chocolate");break;
									case 2:
										System.out.print("vanillia");break;
									case 3:
										System.out.print("strawberry");
			}break;
					case 3:
						System.out.print("Shake: \n 1. chocolate \n 2. vanillia \n 3. strawberry \n");
						int shake = input.nextInt();
								switch (shake){
									case 1:
										System.out.print("chocolate");break;
									case 2:
										System.out.print("vanillia");break;
									case 3:
										System.out.print("strawberry");
			}break;
		}
	}
}