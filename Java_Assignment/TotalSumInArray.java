public class TotalSumInArray {

	public static void main(String... args){

	int [] values = {1, 2, 3, 4, 5, 6};

	int sum = 0;

	for (int number = 0; number < values.length; number++) {
			sum+= values [number];
		}
	System.out.println("The sum in array is: " + sum);
	} 
}