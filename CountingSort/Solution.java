package CountingSort;

import java.util.Arrays;

public class Solution {
    public static void main(final String[] args) {
        System.out.println("Counting sort in Java");
        final int[] input = { 60, 40, 30, 20, 10, 40, 30, 60, 60, 20, 40, 30, 40 };
        final int k = 60;
        System.out.println("integer array before sorting");
        System.out.println(Arrays.toString(input));
        // sorting array using Counting Sort Algorithm
        countingSort(input, k);
        System.out.println("integer array after sorting using counting sort algorithm");
        System.out.println(Arrays.toString(input));

    }

    public static void countingSort(final int[] input, final int k) {
        // create buckets
        final int counter[] = new int[k + 1];

        // fill buckets
        for (final int i : input) {
            counter[i]++;
        }

        // sort array
        int ndx = 0;
        for (int i = 0; i < counter.length; i++) {
            while (0 < counter[i]) {
                input[ndx++] = i;
                counter[i]--;
            }
        }
    }

}
