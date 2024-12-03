import java.util.Scanner;

public class ReverseMultiplicationTable {

    public static void main(String... args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of multiplication table: ");
	int number = input.nextInt();

	System.out.println("Enter the range for the table: ");
	int range = input.nextInt();

        System.out.println("Reverse Multiplication Table for " + number + ":");
        for (int table = range; table >= 1; table--) {
            System.out.println(number + " * " + table + " = " + (number * table));
        }
    }
}