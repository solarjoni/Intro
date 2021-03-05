/*
    Write a code, which take integer number from user and print it to standard output.
    Following message should be displayed "User input X" - where X is the value of number provided by user.
    Expect that user should input only integer values

    Handle user input with Scanner library.
    Perform testing, how the program behaves for data types other than integer.
 */
package ex4;
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Input integer number: ");
        String string = sc.nextLine();
        try {
            int number = Integer.parseInt(string);
            System.out.println("User input value: " + number);
        } catch (Exception e) {
            System.out.println("Invalid input! " + string);
        }

    }
}

