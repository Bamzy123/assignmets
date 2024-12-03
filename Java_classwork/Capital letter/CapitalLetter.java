public class CapitalLetter {

   public static String toUpperCaseString(String letters) {

	if (letters == null) {
		return "";
		}
		return letters.toUpperCase();
	}

	public static void main (String[] args) {

		String words = "hello, how are you?";
		String capitalWords = toUpperCaseString(words);

		System.out.println(capitalWords);
	}
}