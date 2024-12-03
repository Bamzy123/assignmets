import java.util.Arrays;
import java.util.Scanner;

public class PersonalityTest{

	public static void main(String... args){

	Scanner input = new Scanner(System.in);

	System.out.println("Please enter your name: ");
	String name = input.nextLine();

	

		System.out.println ("Hello " + name + " follow the mbti test to get your desired result \n");

		int [] a = new int[4];
		int [] b = new int[4];

		String [][] question = {

		{"Question 1: A. expend energy, enjoy groups", "\tB. conserve energy, enjoy one-on-one \n"},

		{"Question 2: A. Interpret literally", "\tB. look for meaning and possibilities \n"},

		{"Question 3: A. logic, thinking, questioning", "B. empathetic, feeling, accommodating \n"},

		{"Question 4: A. organised, orderly", "\tB. flexible, adaptable \n"},

		{"Question 5: A. more outgoing, think out loud", "\tB. more reserved, think to yourself \n"},

		{"Question 6: A. practical realistic, experiential", "\tB. imaginative, innovative, theoretical \n"},

		{"Question 7: A. candid, straight forward, frank", "\tB. tactful, kind, encouraging \n"},

		{"Question 8: A. plan, schedule", "\tB. unplanned, spontaneous \n"},
	
		{"Question 9: A. seek many tasks, public activities, interacting with others", "\tB. seek private, solitary activities with quiet to concentrate \n"},

		{"Question 10: A. standard, usual, conventional", "\tB. different, novel, unique \n"},

		{"Question 11: A. firm, tend to criticize, hold the line", "\tB. gentle, tend to appreciate, conciliate \n"},

		{"Question 12: A. regulated, structured", "\tB. easy-going, live and let live \n"},

		{"Question 13: A. external, communicative, express yourself", "\tB. internal, reticent, keep to yourself \n"},

		{"Question 14: A. focus on here-and-now", "\tB. look to the future, global perspective, big picture \n"},

		{"Question 15: A. tough-minded, just", "\tB. tender-hearted, merciful \n"},

		{"Question 16: A. preparation, plan ahead", "\tB. go with the flow, adapt as you go \n"},

		{"Question 17: A. active, initiate", "\tB. reflective, deliberate \n"},

		{"Question 18: A. facts, things, what is", "\tB. ideas, dreams, what could be, philosophical \n"},

		{"Question 19: A. matter of fact, issue-oriented", "\tB. sensitive, people-oriented, compassionate \n"},

		{"Question 20: A. control, govern", "\tB. latitude, freedom \n"}

		};
		

		for (int response = 0; response < question.length; response++) {
			System.out.print(question [response][0]);
			System.out.println(question [response][1]);

			System.out.print("Please enter (A or B) reponse >>>>>>>>>>>> \n");
			String answer = input.nextLine().toUpperCase();

			if (!answer.equals("A") && !answer.equals("B")) {
			
				System.out.println("Invalid input, expected (A or B) as response: \n");
			}
		}	
	}

}