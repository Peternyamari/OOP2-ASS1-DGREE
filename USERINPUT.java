
package user.input;

import java.util.Scanner;
/*
 * A simple program to demonstrate user input and password verification.
 * If the correct password and username is entered, the user is welcomed,
 * user has only 3 number of attempts before the system blocks.
 * @author PETER
 */
public class USERINPUT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Creating a Scanner object to read user input from the console
        Scanner sc = new Scanner(System.in);

        // Three attempts for username and password
        for (int attempt = 1; attempt <= 3; attempt++) {
            System.out.printf("ENTER USERNAME: ");
            String username = sc.nextLine();
            System.out.printf("ENTER PASSWORD: ");
            int password = sc.nextInt();
            sc.nextLine(); // Consume the newline character left by nextInt()

            // Check if the username and password are correct
            if (password == 1234 && username.equals("peter")) {
                System.out.println("WELCOME USER");
                // Exit the program if the correct password and username are entered
                System.exit(0);
            } else {
                // Display a message for an incorrect username and password attempt
                System.out.println("Incorrect username or password, attempts remaining: " + (3 - attempt));
            }
        }

        // Display a message when all attempts are exhausted
        System.out.println("System blocked! Please contact admin!");
    }
}
