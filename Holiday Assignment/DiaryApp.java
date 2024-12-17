import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class DiaryApp {

    static ArrayList<String> diary = new ArrayList<String>();
    static Scanner input = new Scanner(System.in);
    static int pin = 0;

    public static void mainMenu(){
        String prompt = """
                WELCOME TO AYO'S DIARY
                CREATE NEW PIN CODE
              
                """;
        System.out.println(prompt);
        pin = input.nextInt();

        if(pin > 0){
            createDiary();
        }
    }


    public static void createEntry(){

        System.out.println("LOADING>>>>>>>>>>>>>>>>>>>>>>>>>>");


        System.out.println("Enter diary number ");
                diary.add(input.nextLine());

                input.nextLine();

                System.out.println("Enter a title");
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
        return userInput;
    }

    public static void findEntryById(String userInput){
        ArrayList<String> temp = new ArrayList<>();
        for(int counter = 0; counter < diary.size(); counter++){
            if(diary.get(counter).equals(userInput)){
                temp.add(diary.get(counter));
            }
        }
        System.out.println(temp);
    }

    public static void updateEntry(){
        System.out.println("Enter any field to update");
        String updateField = input.nextLine();
        int theIndex = diary.indexOf(updateField);
        System.out.println("Loading>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Enter value to update");
        String updatedField = input.nextLine();
        diary.set(theIndex, updatedField);
        System.out.println(diary);
    }

    public static void createDiary(){
        String prompt = """
                1. Add Entry
                2. Update Entry
                3. Delete Entry
                4. Find Entry by Id
                """;
        System.out.println(prompt);
        int userInput = input.nextInt();

        switch(userInput){
            case 1: createEntry();
            case 2: updateEntry();
            case 4: findEntryPrompt();
        }
    }

    public static void main(String[] args){
        mainMenu();
    }
}