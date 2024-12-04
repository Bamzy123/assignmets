import java.util.Scanner;
import java.util.Arrays;

public class StudentGradeApp {

public static void main (String... args) {

Scanner input = new Scanner (System.in);

System.out.println("How many student do you have? ");
int totalStudent = input.nextInt();

System.out.println("How many subject do they offer? ");
int totalSubject = input.nextInt();



int [][] student = new int[totalStudent][totalSubject];
int [] sum = new int[totalStudent];
int [] totalSum = new int[totalStudent];
double [] average = new double[totalStudent];
int [] position = new int[totalStudent];

for(int number = 0, counter = 1; number < totalStudent; number++, counter++) {
        int total = 0;

	for(int index = 0, count = 1; index < totalSubject; index++, count++) {
		System.out.print("Enter the score of student "+ counter + "\n Enter the score of subject" + count +": " );

		student[number][index] = input.nextInt();

		System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>\n");
		
		System.out.println("Saved successfully");
		System.out.println("======================================================================");
		total += student[number][index];

         	 }

	  	sum[number] = total;
		totalSum[number] = total;
		average[number] = (double) total / totalSubject;
       		}

		Arrays.sort(totalSum);

		for (int number = 0, count = 1; number < student.length; number++, count++) {
			for (int index = 0; index < student.length; index++) {
			if (sum[number] == totalSum[index]) {
				position[number] = student.length - index;
			}
		}
	}
		System.out.print("STUDENT");

		for(int number = 1; number <= totalSubject; number++) {
			System.out.printf("%10s", "SUB" + number);

		}
		
		System.out.printf("%10s%10s%10s%n", "TOT", "AVE", "POS");
		System.out.println("======================================================================");
		
		for(int number = 0, count = 1; number < totalStudent; number++, count++) {
			System.out.print("student "+ count);

		     for(int index = 0; index < totalSubject; index++) {
				System.out.printf("%10d", student[number][index]);
				}
				System.out.printf("%8d%9.2f%10d%n", sum[number], average[number], position[number]);
	System.out.println("======================================================================");
				System.out.println();
	System.out.println("======================================================================");
	}

System.out.println("\n SUBJECT SUMMARY");


			for (int number = 0; number < totalSubject; number++) {

			int largest = -1;
			int smallest = 101;
			int highestStudent = 0;
			int lowestStudent = 0;
			int totalSubjectOfStudent = 0;
			int totalScoreOfStudent = 0;
			int pass = 0;
			int fail = 0;

				for(int index = 0; index < totalStudent; index++) {
					totalScoreOfStudent += student[index][number];
					if(student [index][number] >= 40) {
						pass += 1;
				}
					else {
						fail += 1;
				}
					if(student [index][number] > largest) {
						largest = student[index][number];
						highestStudent = index + 1;
				}
					if(student [index][number] < smallest) {
						smallest = student[index][number];
						lowestStudent = index + 1;
				}

			}

			double averageTotalScoreOfStudent = totalScoreOfStudent / totalStudent;
			System.out.println("\nSubject" + (number + 1));	

			System.out.println("Hightest scoring student is: Student" + highestStudent +" scoring "+ largest);

			System.out.println("Lowest scoring student is: Student" + lowestStudent + " scoring " + smallest);

			System.out.println("Total score is: " + totalScoreOfStudent);

			System.out.printf("Average score is: " + averageTotalScoreOfStudent);

			System.out.println("\nNumber of passes: " + pass +"\nNUmber of fails: " + fail);
		}	
	}


}