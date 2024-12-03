/**speudocode

* create two arrays that can hold two array element
* assign 1, 3, 5 to a variable name call number
* assign 2, 4, 6 to a variable name call digit
* determine the length in both arrays
* assign both number and digit to a variable name call value
* create a new instance of value
* use a predefined function called arraycopy
* 
* **/


public class Merge {

public static void main (String... args) {

		int [] number = {1, 3, 5};

		int [] digit = {2, 4, 6};

		int numberOne = number.length;

		int digitOne = digit.length;

		int value = numberOne + digitOne;

		int [] value1 = new int [value];

		System.arraycopy(number, 0, value1, 0, numberOne);

		System.arraycopy(digit, 0, value1, numberOne, digitOne);


		System.out.println("" + Arrays.toString(value1));
	}
}