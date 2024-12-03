public class StringChecker {

    public static boolean isString(String inputString) {

        inputString = inputString.toLowerCase();

        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (inputString.indexOf(ch) == -1) {
                  return false;
            }
        }

          return true;
        }
    public static void main (String... args) {

		System.out.println("The quick brown fox jumps over the lazy dog");
	}

   }