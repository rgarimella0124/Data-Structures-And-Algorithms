package NonRepeatedCharactersInString;

import java.util.Scanner;

public class Solution {
    public static void main(final String[] args) {
        final Scanner s = new Scanner(System.in);
        System.out.println("Enter the String ");
        final String str = s.next();
        final char[] arr = new char[str.length()];
        for (int j = 0; j < arr.length; j++) {
            arr[j] = str.charAt(j);
        }
        final char found = searchchar(str, arr);
        s.close();
        System.out.println("The first non repeated char is " + found);
    }

    public static char searchchar(final String a, final char[] b) {
        int i = 0;
        while (i != a.length()) {
            int count = 0;
            for (int j = 0; j < b.length; j++) {
                if (i != j) {
                    if (a.charAt(i) != b[j]) {
                        count++;
                    }
                }
                if (count == a.length() - 1) {
                    return a.charAt(i);
                }
            }
            i++;
        }
        return 0;
    }
}