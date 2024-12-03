public class Maximum{
 public static void main(String[] args){

	int num1 = 1;
	int num2 = 2;
	int num3 = 3;

	if (num1 > num2 && num1 > num3){
	   System.out.printf("%d", num1);
       }
	else if (num2 > num1 && num2 > num3){
	   System.out.printf("%d", num2);
       }
	else if (num3 > num1 && num3 > num2){
	  System.out.printf("%d", num3);
	}
    }
}