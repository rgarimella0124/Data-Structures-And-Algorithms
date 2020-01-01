package ArrayReverse;

import java.util.Arrays;

public class Solution {

    public static void main(final String args[]) {

        final String[] names = { "John", "Jammy", "Luke" };
        System.out.println("original array: " + Arrays.toString(names));

        // reversing array with three elements
        reverse(names);
        System.out.println("reversed array: " + Arrays.toString(names));

        final String[] test = { "John" };
        System.out.println("original array: " + Arrays.toString(test));

        // testing reverse array function with array of just one element
        reverse(test);
        System.out.println("reversed array: " + Arrays.toString(test));
    }

    /**
     * Java Method to reverse String array in place
     *
     * @param array
     */
    public static void reverse(final String[] array) {

        if (array == null || array.length < 2) {
            return;
        }

        for (int i = 0; i < array.length / 2; i++) {
            final String temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

    }

}