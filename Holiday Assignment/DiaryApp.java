import java.util.Scanner;
import java.util.HashMap;

public class DiaryApp {

    private static final HashMap<Integer, DiaryEntry> diary = new HashMap<>();
    private static final Scanner input = new Scanner(System.in);
    private static int pin = -1;
    private static boolean isLocked = false;

    static class DiaryEntry {
        String title;
        String content;

        DiaryEntry(String title, String content) {
            this.title = title;
            this.content = content;
        }

        @Override
        public String toString() {
            return "Title: " + title + "\nContent: " + content;
        }
    }

    public static void mainMenu() {
        String prompt = """
                WELCOME TO BAMSY DIARY
                CREATE NEW PIN CODE:
               """;
        System.out.print(prompt);
        pin = input.nextInt();
        input.nextLine();

        if (pin > 0) {
            createDiary();
        }
    }

    public static void createEntry() {
        System.out.println("LOADING >>>>>>>>>>");

        System.out.println("Enter your diary id: ");
        int diaryId = input.nextInt();
        input.nextLine();

        System.out.println("Enter your diary title: ");
        String title = input.nextLine();

        System.out.println("Enter the content of your diary: ");
        String content = input.nextLine();

        diary.put(diaryId, new DiaryEntry(title, content));

        System.out.println("Diary Entry Added: ");
        System.out.println(diary.get(diaryId));

        System.out.println("Would you like to add more? (yes/no)");
        String userInput = input.nextLine();

        if (userInput.equalsIgnoreCase("yes")) {
            createEntry();
        } else {
            createDiary();
        }
    }

    public static void findEntryPrompt() {
        System.out.println("Enter diary id to find entry:");
        int diaryId = input.nextInt();
        input.nextLine();
        findEntryById(diaryId);
    }

    public static void findEntryById(int diaryId) {
        DiaryEntry entry = diary.get(diaryId);
        if (entry != null) {
            System.out.println(entry);
        } else {
            System.out.println("Entry not found.");
        }
    }

    public static void updateEntry() {
        System.out.println("Enter diary number to update: ");
        int diaryId = input.nextInt();
        input.nextLine();

        DiaryEntry entry = diary.get(diaryId);
        if (entry != null) {
            System.out.println("Enter new title: ");
            String newTitle = input.nextLine();

            System.out.println("Enter new content: ");
            String newContent = input.nextLine();

            entry.title = newTitle;
            entry.content = newContent;

            System.out.println("Diary Entry Updated: ");
            System.out.println(entry);
        } else {
            System.out.println("Entry not found!");
        }
    }

    public static void createDiary() {
        while (true) {
            if (isLocked) {
                System.out.println("Diary is locked, please unlock it first...");
                unlockDiary();
                continue;
            }

            String prompt = """
                    1. Add Entry
                    2. Update Entry
                    3. Delete Entry
                    4. Find Entry by Id
                    5. Lock Diary
                    6. Exit
                   """;
            System.out.println(prompt);
            int userInput = input.nextInt();
            input.nextLine();

            switch (userInput) {
                case 1 -> createEntry();
                case 2 -> updateEntry();
                case 4 -> findEntryPrompt();
                case 5 -> lockDiary();
                case 6 -> {
                    System.out.println("Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid option...");
            }
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
        } else {
            System.out.println("Incorrect pin, try again...");
        }
    }

    public static void main(String... args) {
        mainMenu();
    }
}
