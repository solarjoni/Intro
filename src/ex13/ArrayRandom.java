/*
    Write a program which creates the array for 10 values, integer type.
    Program should populate values in array with a random numbers from [-10..10]. Then:

    print array and it's values
    print minimum value from array
    print maximum value from array
 */

package ex13;

public class ArrayRandom {

    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = -10 + (int) (Math.random() * 21);
        }
        System.out.println("Print random array values:");
        for (int a : arr) {
            System.out.print(a + " ");
        }
        int maxValue = maxArrayValue(arr);
        System.out.println("\nMax is " + maxValue);
        int minValue = minArrayValue(arr);
        System.out.println("Min is " + minValue);


    }

    // Finds max arr value
    public static int maxArrayValue(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[1] > max) {
                max = arr[i];
            }

        }
        return max;
    }

    // Finds min arr value
    public static int minArrayValue(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
