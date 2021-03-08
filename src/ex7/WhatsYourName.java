/*
    Write a program, which reads user input, but first print "What's your name?" on standard output.
    Name should be displayed on screen. If name equals "John Wick", then print "I see you working again John",
    otherwise print "Welcome, [xyz]", where [xyz] display the value provided by user
 */
package ex7;

import java.util.Scanner;

public class WhatsYourName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input name
        System.out.println("Whats your name? ");

        String name = sc.nextLine();

        //Print name on standard output
        System.out.println("Provided name is " + name);

        // Check name
        if ("John Wick".equals(name)) {
            System.out.println("I see you working again John");
        } else {
            System.out.println("Welcome " + name);
        }
    }
}
