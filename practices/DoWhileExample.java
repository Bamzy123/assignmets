import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.print("Enter a number (negative to quit): ");
            number = scanner.nextInt();
            System.out.println("You entered: " + number);
        } while (number >= 0);

        System.out.println("Program terminated.");
        scanner.close();
    }
}
