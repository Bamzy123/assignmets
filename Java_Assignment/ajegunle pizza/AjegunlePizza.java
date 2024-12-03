 import java.util.Scanner;

public class AjegunlePizza {

    public static void main(String... args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Welcome to Iya Moses Pizza joint, Ajegunle. \n\nWe sell the best and most affordable pizza's in town");

        int orderNumber = getOrderNumber(input);
        displayMenu();
        int orderType = getOrderType(input);
        calculateAndDisplayOrder(orderNumber, orderType);
    }

    static int getOrderNumber(Scanner input) {
        int orderNumber = -1;
        while (orderNumber < 0) {
            System.out.print("\nPlease enter the number of people you would like to order for (Each person gets 1 slice of pizza): ");
            orderNumber = input.nextInt();

            if (orderNumber < 0) {
                System.out.print("Invalid Input. Enter a valid number: ");
            }
        }
        return orderNumber;
    }

    static void displayMenu() {
        System.out.println("\nBelow is the information of the type of Pizza we have and the price information:\n");
        System.out.println("Pizza Type\tNumber of Slices\tPrice Per Box");
        System.out.println("1. Sapa size\t\t4\t\t2,500");
        System.out.println("2. Small Money\t\t6\t\t2,900");
        System.out.println("3. Big boys\t\t8\t\t4,000");
        System.out.println("4. Odogwu\t\t12\t\t5,200");

        System.out.println();
    }

    static int getOrderType(Scanner input) {
        int orderType = -1;
        while (orderType < 1 || orderType > 4) {
            System.out.print("Select a number corresponding to the pizza type you would like to order: ");
            orderType = input.nextInt();

            if (orderType < 1 || orderType > 4) {
                System.out.print("Invalid Order Type. Enter a valid number from the menu above: ");
            }
        }
        return orderType;
    }

    static void calculateAndDisplayOrder(int orderNumber, int orderType) {
        int slicesPerBox = 0;
        double pricePerBox = 0;
        String pizzaType = "";

        switch (orderType) {
            case 1:
                pizzaType = "Sapa size";
                slicesPerBox = 4;
                pricePerBox = 2500;
                break;
            case 2:
                pizzaType = "Small Money";
                slicesPerBox = 6;
                pricePerBox = 2900;
                break;
            case 3:
                pizzaType = "Big boys";
                slicesPerBox = 8;
                pricePerBox = 4000;
                break;
            case 4:
                pizzaType = "Odogwu";
                slicesPerBox = 12;
                pricePerBox = 5200;
                break;
        }

        int numberOfBoxes = (int) Math.ceil((double) orderNumber / slicesPerBox);

        int leftOvers = (numberOfBoxes * slicesPerBox) - orderNumber;

        double totalPrice = numberOfBoxes * pricePerBox;

        System.out.println("\nYou ordered for the " + pizzaType + " pizza costing " + pricePerBox);

        System.out.println("Number of boxes of pizza to buy: " + numberOfBoxes + " boxes");

        System.out.println("Number of left-over slices after serving: " + leftOvers + " slices");

        System.out.println("Total Price: " + totalPrice);
    }
}
