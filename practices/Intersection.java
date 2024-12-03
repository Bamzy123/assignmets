import java.util.Arrays;
public class Intersection{
public static void main (String... args){


int [] number = {1, 3, 5};

int [] secondNumber = {2, 4, 6};

int [] result = new int [number.length + secondNumber.length];


for(int index = 0; index < result.length; index++){
		
	if(index < number.length){
		
	result[index] = number[index];
		}
	else{
		result[index] = secondNumber[index-number.length];
		}

	}

	

      for(int index = 0; index < result.length; index++){
	for(int count = 0; count < result.length; count++){

		if(result[index] < result[count]){
		int temp = result[index];
		result[index] = result[count];
		result[count] = temp;
			}

				}
	}

	System.out.println(Arrays.toString(result));

	


}


}