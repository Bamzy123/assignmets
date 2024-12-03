import java.util.Scanner;

public class GasMileage {
 public static void main(String... args){

	Scanner iyanu = new Scanner(System.in);

	System.out.print("Input miles driven: ");
	int miles = iyanu.nextInt();

	System.out.print("Input the gallon used: ");
	int gallon = iyanu.nextInt();

	int milesPerGallon = miles * gallon;

	System.out.printf("The combined miles per gallon is: %d", milesPerGallon);
    }
}