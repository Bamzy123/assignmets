import java.util.Arrays;

public class ArrayTest{

	public static void main(String... args){

		int [] [] numbers = new int [2] [3];
		numbers [1] [1] = 2;

		System.out.println(Arrays.deepToString(numbers));
	}
}