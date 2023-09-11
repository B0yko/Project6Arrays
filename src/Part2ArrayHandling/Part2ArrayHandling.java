package Part2ArrayHandling;

import java.util.Scanner;
import java.util.Random;
public class Part2ArrayHandling {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int[] userArray = inputArray(in);
        int sum = calculateSum(userArray);
        System.out.println("Sum of array elements: " + sum);

        int[] randomArray = createRandomArray(in);
        int largestValue = findLargestValue(randomArray);
        System.out.println("Largest value in the array: " + largestValue);

        System.out.print("Enter a value to search in the array: ");
        int searchValue = in.nextInt();
        int index = searchValueInArray(userArray, searchValue);
        if (index != -1) {
            System.out.println("Value found at index: " + index);
        } else {
            System.out.println("Value not found in the array.");
        }
    }
    public static int[] inputArray(Scanner in) {
        System.out.print("Enter the length of the array: ");
        int length = in.nextInt();
        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = in.nextInt();
        }
        return array;
    }
    public static int[] createRandomArray(Scanner in) {
        System.out.print("Enter the length of the random array: ");
        int length = in.nextInt();
        int[] array = new int[length];
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }
    public static void printArray(int[] array) {
        System.out.println("Array: ");
        for (int i : array) {
            System.out.println(i + " ");
        }
        System.out.println();
    }
    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }
    public static int findLargestValue(int[] array) {
        int largest = Integer.MIN_VALUE;
        for (int i : array) {
            if (i > largest) {
                largest = i;
            }
        }
        return largest;
    }
    public static int searchValueInArray(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
