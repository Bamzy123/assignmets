import java.util.Scanner;

public class AtmApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        String accountName = "";
        double balance = 0.0;
        int pin = -1;
        int choice;
        int inputPin;
        
        do {
            System.out.println("Welcome to the ATM!");
            System.out.println("1. Account Name");
            System.out.println("2. Create your pin");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Check Balance");
            System.out.println("6. Change Pin");
            System.out.println("7. Transfer to another account");
            System.out.println("8. Close account");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            scanner.nextLine();  

            switch (choice) {
                case 1:
                    
                    System.out.print("Enter your First and Last name: ");
                    accountName = scanner.nextLine();
                    System.out.println("Account name set to: " + accountName);
                    break;

                case 2:
                 
                    System.out.print("Enter your pin: ");
                    pin = scanner.nextInt();
                    System.out.println("Pin set successfully.");
                    break;

                case 3:
                
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    if (depositAmount > 0) {
                        balance += depositAmount;
                        System.out.println("Deposited: $" + depositAmount);
                    } else {
                        System.out.println("Please enter a valid amount.");
                    }
                    break;

                case 4:
                   
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    if (withdrawAmount > 0 && withdrawAmount <= balance) {
                        balance -= withdrawAmount;
                        System.out.println("Withdrawn: $" + withdrawAmount);
                    } else {
                        System.out.println("Invalid withdrawal amount.");
                    }
                    break;

                case 5:
                  
                    System.out.println("Current balance: $" + balance);
                    break;

                case 6:
               
                    System.out.print("Enter your old pin: ");
                    int oldPin = scanner.nextInt();
                    if (oldPin == pin) {
                        System.out.print("Enter your new pin: ");
                        int newPin = scanner.nextInt();
                        pin = newPin;
                        System.out.println("Pin changed successfully.");
                    } else {
                        System.out.println("Incorrect old pin. Please try again.");
                    }
                    break;

                case 7:
                  
                    System.out.print("Enter your pin: ");
                    inputPin = scanner.nextInt();
                    if (inputPin == pin) {
                        System.out.print("Enter amount you want to transfer: ");
                        double transferAmount = scanner.nextDouble();
                        if (transferAmount > 0 && transferAmount <= balance) {
                            balance -= transferAmount;
                            System.out.println("Transferred: $" + transferAmount);
                        } else {
                            System.out.println("Transfer failed: Insufficient funds or invalid amount.");
                        }
                    } else {
                        System.out.println("Incorrect pin. Transfer not possible.");
                    }
                    break;

                case 8:
             
                    System.out.println("THANKS FOR USING THE ATM, GOODBYE!");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (choice != 8);
    }
}
