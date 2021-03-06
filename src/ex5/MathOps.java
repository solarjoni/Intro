/*
        Write a code, which takes two integer number as an input and then perform math operations

        addition
        subtraction
        multiplication
        division
        raising to a power (in that case first argument will be a number raised to power,
        second argument will be a power number.
        The result of operation should be assigned to newly initialized variable of correct type.

        Result should be displayed in correct way on the screen

        addition -> "a = A, b = B, results is C"
        subtraction -> "a = A, b = B, results is C"
        multiplication -> "a = A, b = B, results is C"
        division -> "a = A, b = B, results is C"
        raising to a power -> "a = A, raised to power B, gives us C" */

package ex5;

import java.util.Scanner;

public class MathOps {
    private int a;
    private int b;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public static void main(String[] args) {
        MathOps ops = new MathOps();
        ops.Operations();
    }

    public void Operations() {
    Scanner input = new Scanner(System.in);

        while(true) {
            System.out.println("Input first number: ");
            try {
                setA(Integer.parseInt(input.nextLine()));
                break;
            } catch (Exception e) {
                System.out.println("Wrong input!");
            }
        }


        while(getB() == 0) {
            System.out.println("Input second number: ");
            try {
                setB(Integer.parseInt(input.nextLine()));
                if (getB() == 0) {
                    System.out.println("Number must not be 0!");
                    setB(0);
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Wrong input!");
            }
        }

        System.out.println("a = " + getA() + ", b = " + getB());
        System.out.println(getA() + " added to " + getB() + " equals " + (getA() + getB()) );
        System.out.println(getA() + " subtracted from " + getB() + " equals " + (getA() - getB()) );
        System.out.println(getA() + " multiplied by " + getB() + " is: " + getA() * getB() );
        if (getB() != 0) {
            System.out.println("Division of " + getA() + " by " + getB() + " equals " + getA() / getB());
        } else {
            System.out.println("Division by zero!");
        }
        System.out.println("Raising " + getA() + " to power of " + getB() + " is: " + Math.pow(getA(), getB()));
    }
}
