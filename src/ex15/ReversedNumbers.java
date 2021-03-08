/*
    Write a program, which takes an number from user and display it reversed:

    for 1234, program should return 4321
    for 654789, program should return 987456

 */

package ex15;

import java.util.Scanner;

public class ReversedNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.next();
        char[] ch = str.toCharArray();
        System.out.println("Reversed:");
        for (int i = ch.length - 1; i >= 0; i-- ) {
            System.out.print(ch[i]);
        }
    }
}
