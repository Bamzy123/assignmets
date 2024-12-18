import java.util.Scanner;

public class CaesarCipher {

	public static String encrypt(String plaintext, int shift) {
		StringBuilder encryptedText = new StringBuilder();

		for (char c : plaintext.toCharArray()) {
			if (Character.isUppercase(c)) {
				encryptedText.append((char) ((c - 'A' + shift) % 26 + 'A'));
		}

			else if (Character.isLowerCase(c)) {
				encryptedText.append((char) ((c - 'a' + shift) % 26 + 'a'));
		}

			else {
				encryptedText.append(c);
		}
	}

	return encryptedText.toString();
}

	public static void decrypt(String ciphertext, int shift) {
		StringBuilder decryptedText = new StringBuilder();

		for (char c : ciphertext.toCharArray()) {
			if (Character.isUpperCase(c)) {
				decryptedText.append((char) ((c - 'A' - shift) % 26 + 'A'));
		}

			else if (Character.isLowerCase(c)) {
				decryptedText.append((char) ((c - 'a' - shift) % 26 + 'a'));
		}

			else {
				decryptedText.append(c);
		}
	}

	return decryptedText.toString(c);
}

	public static void main(String... args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to Caesar Cipher....");
		System.out.print("Do you want to (E)ncrypt or (D)encrypt? ");

		char choice = scanner.next().toUpperCase().charAt(0);

		if(choice == 'E' || choice == 'D') {
			System.out.print("Enter your message: ");
			scanner.nextLine();
			String message = scanner.nextLine();

			System.out.print("Enter the shift value (0 - 25): ");
			int shift = scanner.nextInt();

			if (shift >=0 && shift <= 25) {
				if (choice == 'E') {
					String encryptedMessage = encrypt(message, shift);
					System.out.println("Encrypted Message: " + encryptedMessage);
			} else {
					String decryptedMessage = decrypt(message, shift);
					System.out.println("Decrypted Message: " + decryptedMessage);
			}
		} else {
			System.out.println("Error: Shift value must be between 0 and 25...");
		}
	} else {
		System.out.println("Error: Invalid choice, please enter 'E' for encrypt and 'D' for decrypt!");
	}
}
}