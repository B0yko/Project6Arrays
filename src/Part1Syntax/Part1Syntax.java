package Part1Syntax;

import java.util.Scanner;
public class Part1Syntax {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        // Demonstration of arrays creating
        int[] array1 = new int[10]; // with predefined size

        System.out.println("Enter array size");
        int size = in.nextInt();
        int[] array2 = new int[size]; // with size defined in a variable

        int[] array3 = {1, 2, 3, 4, 5}; // with literal

        System.out.println("Length of intArray: " + array2.length); // demonstration of array.length
        demAnotherType(); // demonstration of another types of arrays in the method

        // demonstration of assignment value to array element
        array1[4] = 45;
        System.out.println("5th element value: " + array1[4]);

        /** Demonstration of error of accessing array element by non-existing index demonstration
        System.out.println(array1[11]); */

        System.out.println("Traversing over intArray using a for loop:");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();

        System.out.println("Traversing over array3 (literal) using an enhanced for loop:");
        for (int value : array3) {
            System.out.print(value + " ");
        }
        System.out.println();

    }
    public static void demAnotherType() {
        double[] doubleArray = new double[10];

        int size = 5;
        float[] floatArray2 = new float[size];

        String[] stringArray = {"Kyiv", "Odesa", "Harkiv", "Dnipro", "Lviv"};

        char[] charArray = {'A', 'B', 'C', 'D', 'E'};

        boolean[] booleanArray = {true, false, true};

        // demonstration of array.length
        System.out.println("Length of doubleArray: " + doubleArray.length);
        System.out.println("Length of stringArray: " + stringArray.length);
        System.out.println("Length of charArray: " + charArray.length);
        System.out.println("Length of booleanArray: " + booleanArray.length);

        System.out.println("Traversing over charArray using a while loop:");
        int index = 0;
        while (index < charArray.length) {
            System.out.print(charArray[index] + " ");
            index++;
        }
        System.out.println();
    }
}
