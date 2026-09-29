import java.util.Scanner;

public class TheaterKiosk {
    public static void main(String[] args) {
        // Create Scanner
        // Prompt user for age
        // If input is a valid int
        //     Read age
        //     If age >= 21, display wrist band message
        // Else tell user to run again with a valid age

        Scanner in = new Scanner(System.in);
        int age = 0;
        String trash = "";

        System.out.print("Enter your age: ");
        if (in.hasNextInt()) {
            age = in.nextInt();
            in.nextLine();

            if (age >= 21) {
                System.out.println("You get a paper wrist band!");
            }
        } else {
            trash = in.nextLine();
            System.out.println("You said your age was: " + trash);
            System.out.println("Run the program again and enter a valid age!");
        }
    }
}
