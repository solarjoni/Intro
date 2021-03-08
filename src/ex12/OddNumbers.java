/*
    Write a program, which take an input from user - positive, integer number.
    Then program should display all odd numbers not greater than number provided by user.
 */

package ex12;

import java.util.Scanner;

public class OddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        // Asks for a number
        System.out.println("Input a number (from 1 to 50):");
        while (true) {
            String str = sc.nextLine();
            try {
                num = Integer.parseInt(str); //Exception possible
                if (num > 0 && num <= 50) {
                    break;
                } else {
                    System.out.println("Number not in range! Enter number from 1 to 50:");
                }
            } catch (Exception e) {
                System.out.println("Bad input " + str);
                System.out.println("Enter a number from 1 to 50");
            }
        }
        for (int i = 0; i <= num; i++) {
            if (i % 2 == 1) { // != 0 Programmers point of view
                System.out.println("Odd number " + i);
            }
        }
    }
}
