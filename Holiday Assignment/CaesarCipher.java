import java.util.Scanner;

public class CaesarCipher {

	public static String decrypt(String plaintext, int shift) {
		StringBuilder decryptedText = new StringBuilder();


		for (char c : plaintext.tocharArray()) {
			if (character.isUppercase(c)) {
				decryptedText.append((char) ((c - 'A' + shift) % 26 + 'A'));
			} else if (character.isLowerCase(c)) {
				decryptedText.append((char) ((c - 'a' + shift) % 26 + 'a'));

			} else {
				decryptedText.append(c);
			}
		}

		return decryptedText.toString();
	}

	public static void main(String... args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to Caesar Cipher....");

		System.out.print("Do you want to (E)ncrypt or (D)encrypt? ");


		char choice = scanner.next().toUpperCase().charAt(0);


		if(choice == 'E' || choice == 'D') {
			System.out.print("Enter your message: ");
			Scanner.nextLine();
			String message = scanner.nextLine();
	}
}