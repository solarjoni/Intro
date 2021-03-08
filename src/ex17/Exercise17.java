/*
    Analyze below code, this code use method fizzBuzz,
    which as an input take integer number.
    Then three conditions are checked:

    number divisible by 3 printout of the word "fizz"
    number divisible by 5 printout of the word "buzz"
    number divisible by 3 and 5 printout of the word "fizzbuzz"
    The program have errors - it does not compile,
    correct the errors and test if the program works correctly for values provided by the user.
 */
package ex17;

import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        Scanner readNumber = new Scanner(System.in);
        System.out.println("Input a number: ");
        int number = readNumber.nextInt();
        String fizzBuzzResult = fizzBuzz(number);
        System.out.println(fizzBuzzResult);
    }

    public static String fizzBuzz(int number) {
        if (number % 5 == 0) {
            if (number % 3 == 0) {
                return "fizzbuzz";
            } else {
                return "buzz";
            }
        } else if (number % 3 == 0) {
            return "fizz";
        }
        return String.valueOf(number);
    }
}
