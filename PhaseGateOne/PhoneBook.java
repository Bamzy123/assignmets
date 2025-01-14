import java.util.Scanner;

import java.util.HashMap;

import java.util.Map;

public class PhoneBook {

public static void main (String... args) {

Scanner scanner = new Scanner (System.in);

Map<String, String> phoneBook = new HashMap<>();

int choice;

	do {

	    System.out.println("Welcome to your phonebook!\n");
	    System.out.println("1. Add contact.");
	    System.out.println("2. Remove contact.");
		System.out.println("3. Find contact by phone number.");
		System.out.println("4. Find contact by first name.");
		System.out.println("5. Find contact by last name.");
		System.out.println("6. Edit contact.");
	    System.out.println("7. exit.");
            System.out.print("Choose an option: ");
	    choice = scanner.nextInt();
	    scanner.nextLine();


	    switch(choice) {
		case 1:
			System.out.print("Enter your contact's name (First name and Last name): ");
			String name = scanner.nextLine();

			System.out.print("Enter your contact's phone number: ");
			String phoneNumber = scanner.nextLine();

			phoneBook.put(phoneNumber, name);
			
			System.out.println();

			System.out.println("Contact added successfully!");break;

		case 2:
			System.out.print("Enter the contact you want to remove: ");
			String removeContact = scanner.nextLine();

			if (phoneBook.containsKey(removeContact)) {

				phoneBook.remove(removeContact);

				System.out.println();

				System.out.println("Contact removed successfully!");
	}

			else {
				System.out.println("Contact not found");
	}break;

		case 3:
			System.out.print("Enter the phone number to find the contact: ");
			String searchNumber = scanner.nextLine();

			if (phoneBook.containsKey(searchNumber)) {

				System.out.println("Contact found: " + phoneBook.get(searchNumber));
	}
			else {
				System.out.println("Contact not found!");
	}break;
		case 4:
			System.out.print("Enter the first name to find contact: ");
			String firstName = scanner.nextLine();
		
			boolean foundFirstName = false;

			for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
				if (entry.getValue().startsWith(firstName)) {
					System.out.println("Found contact: " + entry.getValue() + " - " + entry.getKey());
					foundFirstName = true;
		}
	}
			if (!foundFirstName) {
					System.out.println("No contact found with that first name.");
	}break;
		case 5:
			System.out.print("Enter the last name to find contact: ");
			String lastName = scanner.nextLine();

			boolean foundLastName = false;

			for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
				if (entry.getValue().endsWith(lastName)) {
					System.out.println("Found contact: " + entry.getValue() + " - " + entry.getKey());
					foundLastName = true;
		}
	}
				if (!foundLastName) {
					System.out.println("No contact found with that last name.");
	}break;
		case 6:
			System.out.print("Enter the phone number contact you want to edit: ");
			String numberToEdit = scanner.nextLine();

			if (phoneBook.containsKey(numberToEdit)) {
				System.out.print("Enter the new name for the contact: ");
				String newName = scanner.nextLine();

				phoneBook.put(numberToEdit, newName);

				System.out.println();

				System.out.println("Contact updated successfully!");
	}
			else {
				System.out.println("Contact not found");
	}break;
		case 7:
			System.out.println("Existing your phonebook");break;

		default:
			System.out.println("Invalid option, Please try again.");
}
	}while(choice != 7);

}
}