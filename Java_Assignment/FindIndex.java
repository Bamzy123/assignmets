import java.util.Arrays;
public class FindIndex {

public static void main (String... args){

	int [] number = {2, 43, 22, 50, 77, 99};

	int target = 77;

	int index = Arrays.binarySearch(number, target);

	if (index >= 0) {
			System.out.println("The index of " + target + " is: " + index);
		}
	else {
			System.out.print(target + " in index array is not found!!!");
		}
	}
} 