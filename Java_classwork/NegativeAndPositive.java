import java.util.Scanner;

public class Negative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;

        while (true) {
            System.out.print("Input a number (or -1 to exit): ");
            int num = input.nextInt();

            if (num == -1) {
                break;
            }

            if (num > number) {
                System.out.println("positive");
            } else if (num < number) {
                System.out.println("negative");
            } else {
                System.out.println("zero");
            }
        }

       
    }
}