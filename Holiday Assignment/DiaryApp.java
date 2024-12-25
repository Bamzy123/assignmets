import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class DiaryApp {

    static ArrayList<String> diary = new ArrayList<String>();
    static Scanner input = new Scanner(System.in);
    static int pin = -1;
    static boolean isLocked = false;

    public static void mainMenu(){
        String prompt = """
                WELCOME TO BAMSY DIARY
                CREATE NEW PIN CODE
              
                """;
        System.out.print(prompt);
        pin = input.nextInt();
	input.nextLine();

        if(pin > 0){
            createDiary();
        }
    }


    public static void createEntry(){

        System.out.println("LOADING >>>>>>>>>>>>>>>>>>>>>>>>");


        System.out.println("Enter your diary number ");
                diary.add(input.nextLine());

                input.nextLine();

                System.out.println("Enter your a title");
                diary.add(input.nextLine());

                System.out.println("Enter the content of your diary");
                diary.add(input.nextLine());

                System.out.println(diary);

        System.out.println("Would you like to add more ???");
        String userInput = input.nextLine();

        if (userInput.equals("yes")){
            createEntry();
        }
        else {
            createDiary();
        }
    }

    public static String findEntryPrompt(){
        String prompt = """
                Enter diary id to find entry      
                """;
        System.out.println(prompt);
        String userInput = input.next();
        findEntryById(userInput);
	input.nextLine();
        return userInput;
    }

    public static void findEntryById(String userInput) {
        ArrayList<String> find = new ArrayList<>();
        for(int counter = 0; counter < diary.size(); counter++){
            if(diary.get(counter).equals(userInput)){
                find.add(diary.get(counter));
            }
        }
        System.out.println(find);
    }

    public static void updateEntry() {
        System.out.println("Enter any field to update..");
        String update = input.nextLine();
        int theIndex = diary.indexOf(update);
	if (theIndex == -1) {
		System.out.println("Entry not found!");
		return;
      } 
        System.out.println("LOADING >>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Enter value to update...");
        String updated = input.nextLine();
        diary.set(theIndex, updated);
        System.out.println(diary);
    }

     public static void createDiary() {
	if (isLocked) {
	    System.out.println("Diary is locked, please unlock it first...");
	    unlockDiary();
	    return;
	}

        String prompt = """
		1. Add Entry
		2. Update Entry
		3. Delete Entry
		4. Find Entry by Id
		5. Lock Diary
                """;
        System.out.println(prompt);
        int userInput = input.nextInt();
	input.nextLine();

        switch(userInput){
            case 1 -> createEntry();
            case 2 -> updateEntry();
            case 4 -> findEntryPrompt();
	    case 5 -> lockDiary();
	    default -> System.out.println("Invalid option...");
        }
    }

     public static void lockDiary() {
	isLocked = true;
	System.out.println("Diary is now locked...");
  }

    public static void unlockDiary() {
	System.out.println("Enter your pin to unlock your diary: ");
	int enteredPin = input.nextInt();
	input.nextLine();

	if (enteredPin == pin) {
		isLocked = false;
		System.out.println("Diary unlocked successfully...");
		createDiary();
     }
	else {
		System.out.println("Incorrect pin, try again...");
		unlockDiary();
     }
  }
    public static void main(String... args){
        mainMenu();
    }
}