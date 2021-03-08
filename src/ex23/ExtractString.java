/*
    Write a program which extracts
    the string value from specific range.
    As an input program should take
    the input string and two numbers
    beginning and end of range.
 */
package ex23;

import java.util.Scanner;

public class ExtractString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a string which will be extracted:");
        String string = input.nextLine();
        System.out.println("Input first number in range:");
        int firstIndex = input.nextInt();
        System.out.println("Input second number in range:");
        int secondIndex = input.nextInt();
        input.close();
        System.out.println("String for extract the characters is: " + string);
        System.out.println("Extracted value: " + string.substring(firstIndex, secondIndex));
    }
}
