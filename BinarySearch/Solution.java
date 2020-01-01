package BinarySearch;

import java.util.Scanner;

public class Solution {

    public static void main(final String[] args) {

        final Scanner commandReader = new Scanner(System.in);
        System.out.println("Welcome to Java Program to perform binary search int array");
        System.out.println("Enter total number of elements : ");
        final int length = commandReader.nextInt();
        final int[] input = new int[length];

        System.out.printf("Enter %d integers %n", length);
        for (int i = 0; i < length; i++) {
            input[i] = commandReader.nextInt();
        }

        System.out.println("Please enter number to be searched in array (sorted order)");
        final int key = commandReader.nextInt();

        final int index = performBinarySearch(input, key);

        if (index == -1) {
            System.out.printf("Sorry, %d is not found in array %n", key);
        } else {
            System.out.printf("%d is found in array at index %d %n", key, index);
        }

        commandReader.close();

    }

    /**
     * Java method to perform binary search. It accept an integer array and a number
     * and return the index of number in the array. If number doesn't exists in
     * array then it return -1
     *
     * @param input
     * @param number
     * @return index of given number in array or -1 if not found
     */
    public static int performBinarySearch(final int[] input, final int number) {
        int low = 0;
        int high = input.length - 1;

        while (high >= low) {
            final int middle = (low + high) / 2;
            if (input[middle] == number) {
                return middle;
            } else if (input[middle] < number) {
                low = middle + 1;
            } else if (input[middle] > number) {
                high = middle - 1;
            }
        }
        return -1;
    }

}
