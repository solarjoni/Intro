/*
    Write a program, which prints multiplication table,
    based on range provided by user.
    As an input program should take two integer values.
 */
package ex14;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range of numbers to print their multiplication tables:");
        int startRange = sc.nextInt();
        int finishRange = sc.nextInt();

        for (int start = startRange; start <= finishRange; start++) {
            System.out.println("Multiplication table of " + start);
            for (int one2ten = 1; one2ten <= 10; one2ten++) {
                System.out.println(start + " * " + one2ten + " = " + start * one2ten);
            }

        }
    }
}
