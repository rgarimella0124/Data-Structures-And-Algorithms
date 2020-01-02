package SortingLinkedList;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Solution {

    public static void main(final String args[]) {

        // foods which helps in weight loss
        final List<String> listOfWeightLossFood = new LinkedList<>(
                Arrays.asList("beans", "oats", "avocados", "broccoli"));

        System.out.println("before sorting: " + listOfWeightLossFood);
        listOfWeightLossFood.sort(Comparator.reverseOrder());
        System.out.println("after sorting: " + listOfWeightLossFood);

    }

}
