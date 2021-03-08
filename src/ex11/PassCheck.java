/*
    Write a program, which take an input from user.
    Program should ask for password until user provide the correct password
    In case user provide correct password, it should print "Correct password",
    otherwise, password should be displayed on screen
    and user should have possibility to input password again.

 */
package ex11;

import java.util.Scanner;

public class PassCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask for password message
        System.out.println("Password please:");

        //Check if password is OK
        while (true) {
            String pass = sc.nextLine();
            if ("secretpassword".equals(pass)) {
                System.out.println("Correct passsword");
                break;
            } else {
                System.out.println("Incorrect password");
            }

        }
    }
}

