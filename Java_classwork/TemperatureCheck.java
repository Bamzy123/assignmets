import java.util.Scanner;

public class TemperatureCheck {

	public static void main(String... args){

	Scanner input = new Scanner (System.in);

	int cold = 10;
	int warm = 25;
	int hot = 25;

		System.out.print("Enter temperature: ");
		int temp = input.nextInt();

			if (temp == cold)
				System.out.println("COLD");

			else if (temp <= warm)
				System.out.println("WARM");

			else if (temp > hot)
				System.out.println("HOT");
	}
}