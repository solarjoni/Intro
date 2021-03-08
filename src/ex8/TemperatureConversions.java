/*
    Write a program which convert temperature provided by user:

    from Celsius to Fahrenheit (degrees in Fahrenheit = 1.8 * degrees in Celsius + 32)
    from Fahrenheit to Celsius (degrees in Celsius = (degrees in Fahrenheit - 32 / 1.8))
    from Celsius to Kelvin (degrees in Kelvin = degrees in Celsius + 273.15)
    from Kelvin to Celsius (degrees in Celsius = degrees in Kelvin - 273.15)
    from Kelvin to Fahrenheit (degrees in Fahrenheit = (degrees in Kelvin - 273.15) * 1.8 + 32)
    from Fahrenheit to Kelvin (degrees in Kelvin = ((degrees in Fahrenheit - 32/1.8) + 273.15)

    Write every convert operation in separate method, which will be executed in main method.
 */
package ex8;

import java.util.Scanner;

public class TemperatureConversions {
    static double C;
    static double F;
    static double K;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask for temperature value
        System.out.println("Input temperature value: ");
        C = sc .nextDouble();

        // Converting
        celsiusToFahrenheit();
        fahrenheitToCelsius();
        celsiusToKelvin();
        kelvinToCelsius();
        kelvinToFahrenheit();
        fahrenheitToKelvin();
    }

    public static void celsiusToFahrenheit() {
        F = 1.8 * C + 32;
        System.out.println("Celsius to Fahrenheit: " + F );
    }

    public static void fahrenheitToCelsius() {
        C = F - 32 / 1.8;
        System.out.println("Fahrenheit to Celsius: " + C );
    }

    public static void celsiusToKelvin() {
        K = C + 273.15;
        System.out.println("Celsius to Kelvin: " + K );
    }

    public static void kelvinToCelsius() {
        C = K - 273.15;
        System.out.println("Kelvin to Celsius: " + C );
    }

    public static void kelvinToFahrenheit() {
        F = (K - 273.15) * 1.8 + 32;
        System.out.println("Kelvin to Fahrenheit: " + F );
    }

    public static void fahrenheitToKelvin() {
        K = ((F - 32/1.8) + 273.15);
        System.out.println("Fahrenheit to Kelvin: " + K );
    }
}
