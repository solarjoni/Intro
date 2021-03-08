/*
    Write a program, which reads user input, but first print "Password please" on standard output.
    Password should be displayed on screen.
    If password equals to = 'secret' then print "Welcome to secret place", otherwise end the program.
 */

package ex6;

import java.util.Scanner;

public class SecretPlace {
    public static void main(String[] args) {
        // Input password
        System.out.println("Password please");
        Scanner sc = new Scanner(System.in);
        String pass = sc.nextLine();

        //Print password on standard output
        System.out.println("Provided password is: " + pass);

        // Check password
        if ("secret".equals(pass)) {
            System.out.println("Welcome to secret place.");
        }
    }
}
