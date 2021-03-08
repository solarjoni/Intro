/*
    Write a program which checks that number/string input by user
    is a palindrome Palindrome description:
    Follow with hints: * Get the number to check for palindrome
    * Hold the number in temporary variable
    * Reverse the number
    * Compare the temporary number with reversed number
    * If both numbers are same, print "palindrome number"
    * Else print "not palindrome number"

 */

package ex21;


import java.util.Scanner;

public class Palindrome {
    static String str = "";
    static String reversedStr = "";
    static String newStr = "";
    static String newStr2 = "";
    static StringBuilder newStrB = new StringBuilder();

    public static void main(String[] args) {

        char[] charArray = new char[20];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string/number to check if it is a palindrome:");
        str = sc.next();
        sc.close();

        int len = str.length();
        int index = 0;
        for (int i = len - 1; i >= 0; i--) {
            reversedStr += str.charAt(i);
            charArray[index] = str.charAt(i);
            newStrB.append(str.charAt(i));
            index++;
        }
        newStr = new String(charArray);
        newStr2 = String.valueOf(charArray);
        char[] newChar = str.toCharArray();

        // String string1 = "madam";
        // String string2 = "madam";
        // Checking if reversed string is a palindrome
        if (str.equals(reversedStr)) {
            System.out.println(str);
            System.out.println(reversedStr);
            System.out.println("Entered string/number is palindrome");
        } else {
            System.out.println(str);
            System.out.println(newChar);
            System.out.println("Entered string/number isn't a palindrome");
        }

    }
}


