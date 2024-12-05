import java.util.Scanner;

public class AtmApp {
    private double balance;
    private String name;
    private int pin;


    public AtmApp() {
        this.balance = 0.0;
	this.name = "";
	this.pin = -1;
    }

    public int getPin() {
	return pin;
      }  

    public void getPin(int pin) {
	this.pin = pin;
    }  

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } 
	else {
            System.out.println("Please enter a valid amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } 
	else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public void checkBalance() {
        System.out.println("Current balance: $" + balance);
    }

    public boolean changePin(int oldPin, int newPin) {
	if(this.pin == oldPin) {
	   this.pin = newPin;
	   System.out.println("Pin changed successfully.");
	   return true;
   }
	else {
		System.out.println("Incorrect old Pin, please try again.");
		return false;

    }
}

   public boolean transfer(AtmApp receiver, double amount) {
	if (amount > 0 && amount <= this.balance) {
		this.balance -= amount;
		receiver.deposit(amount);
		System.out.println("Transferred: $" + amount);
		return true;
      }
	else {
		System.out.println("Transfer failed: Insufficient funds or invalid amount");
		return false;
	}
    }
   public String getName() {
	return name;
}

   public void setName(String name) {
	this.name = name;
}


    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        AtmApp atm = new AtmApp();
	AtmApp receiver = new AtmApp();
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
	    System.out.println("8. close account");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
	    scanner.nextLine();

            switch (choice) {
		case 1:
		    System.out.print("Enter your First and Last name's: ");
		    String name = scanner.nextLine();
		    atm.setName(name);
		    System.out.println("Account name set to: " + atm.getName());
		    break;
		case 2:
		    System.out.print("Enter your pin: ");
		    int pin = scanner.nextInt();
		    atm.pin = pin;
		    System.out.println("Pin set successfully.");
		    break;
                case 3:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    atm.deposit(depositAmount);
                    break;
                case 4:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    atm.withdraw(withdrawAmount);
                    break;
                case 5:
                    atm.checkBalance();
                    break;
                case 6:
                    System.out.println("Enter your old pin: ");
		    int oldPin = scanner.nextInt();
		    System.out.println("Enter your new pin: ");
		    int newPin = scanner.nextInt();
		    if (atm.changePin(oldPin, newPin)) {
			atm.pin = newPin;
		}
                    break;
		case 7:
		    System.out.print("Enter your pin: ");
		    inputPin = scanner.nextInt();
		    if (inputPin == atm.pin) {
			System.out.print("Enter amount you want to transfer: ");
			double transferAmount = scanner.nextDouble();
			if (atm.transfer(receiver, transferAmount)) {
				System.out.println("Transfer successful.");
			}
			else {
				System.out.println("Transfer not successful, please try again.");
			}
		}
		break;
		case 8:
		    System.out.println("THANKS FOR USING THE ATM, GOODBYE!");
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (choice != 8);

        scanner.close();
    }
}
