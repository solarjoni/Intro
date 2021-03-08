package ex22;

import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input first string:");
        String firstString = input.nextLine();
        System.out.println("Input second string:");
        String secondString = input.nextLine();
        input.close();
        System.out.printf("Comparing %s and %s: ", firstString, secondString);

        if (firstString.equals(secondString)) {
            System.out.println("Are equal");
        } else {
            System.out.println("Not equal");
        }
        boolean areEquals = firstString.equals(secondString);
        System.out.println("Comparison result: " + areEquals);

    }
}
