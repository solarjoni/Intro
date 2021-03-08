/*
    Write a program, which print on standard output
    following text "This is message in loop" for 5 times.
    Modify code from previous exercise,
    user should have possibility to input
    number of messages displayed on the screen
 */
package ex10;

import java.util.Scanner;

public class LoopyMod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask for loop iteration number
        System.out.println("How many messages (1-10) ?");

        String string = "";
        int loops;
        while (true) {
            try {
                string = sc.nextLine();
                loops = Integer.parseInt(string); // Exception possible
                // Checks if number of loops is between 1 and 10
                if (loops > 0 && loops <= 10) {
                    break;
                } else {
                    System.out.println("Bad number! Enter a value from 1 to 10:");
                }
            } catch (Exception e) {
                System.out.println("Bad input " + string);
                System.out.println("Enter a number from 1 to 10");

            }

        }

        // Iterate and display message
        for (int i = 0; i < loops; i++) {
            System.out.println("This is message from loop");
        }
    }
}
