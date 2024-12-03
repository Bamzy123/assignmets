public class Triangle1 {

public static void main (String... args) {

	printStar(6);
	printNewLine();






	}

public static void printStar() {

	System.out.print("* ");
	}

public static void printNewLine() {

	System.out.println();
	}
public static void printStar(int numberOfTimes) {
	for (int i = 0; i < numberOfTimes; i++) {
		printStar();
	}
}

public static void upperTriangle(int numberOfStar) {

	for (int i = 1; i <= numberOfStar; i++) {

		printStar(i);
		printNewLine();
	}
}
public static void lowerTriangle(int numberOfStars) {

	for (int i = numberOfStars; i > 0; i--) {

		printStar(6);
		printNewLine();
	}

}

public static void stars(int joinStars) {

		upperTriangle(5);
		lowerTriangle(5);
	}

public static void joinTwoTriangle(int length) {

		upperTriangle(length);
		lowerTriangle(length);
	}
}