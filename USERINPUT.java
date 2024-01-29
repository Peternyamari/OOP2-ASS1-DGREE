
package user.input;

import java.util.Scanner;
/*
 * A simple program to demonstrate user input and password verification.
 * If the correct password is entered, the user is welcomed; otherwise,
 * they have a limited number of attempts before the system blocks.
 * @author PETER
 */
public class USERINPUT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creating a Scanner object to read user input from the console
        Scanner sc=new Scanner(System.in);

        // First attempt where the correct password is 1234
        System.out.printf("ENTER PASSWORD:");
        int PasswordAttempt1=sc.nextInt();
        
        // Check if the first password attempt is correct
        if(PasswordAttempt1==1234){
            System.out.println("WELCOME USER");
            // Exit the program if the correct password is entered
            System.exit(0);
        } else {
            // Display a message for an incorrect password attempt
            System.out.println("incorrect password, attempts remaining 2");
        }

        // Second password attempt
        System.out.printf("ENTER PASSWORD:");
        int PasswordAttempt2=sc.nextInt();
        
        // Check if the second password attempt is correct
        if(PasswordAttempt2==1234){
            System.out.println("WELCOME USER");
            System.exit(0);
        } else {
            // Display a message for an incorrect password attempt
            System.out.println("incorrect password, attempts remaining 1");   
        }

        // Third and final password attempt
        System.out.printf("ENTER PASSWORD:");
        int PasswordAttempt3=sc.nextInt();
        
        // Check if the third password attempt is correct
        if(PasswordAttempt3==1234){
            System.out.println("WELCOME USER");
            System.exit(0);
        } else {
            // Display a message when all attempts are exhausted
            System.out.println("System blocked! please contact admin!");   
        }
    }   
}
