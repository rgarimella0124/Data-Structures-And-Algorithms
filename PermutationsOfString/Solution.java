package PermutationsOfString;

import java.util.*;

class Solution {
    public static void main(String[] args) {
        String str;
        System.out.println("Enter a String");
        Scanner sc = new Scanner(System.in);
        str = sc.next();
        permutation("", str);
        sc.close();
    }

    public static void permutation(String fixed, String sub) {
        if (sub.equals("")) {
            System.out.println(fixed);
        } else {
            int a[] = new int[256];
            for (int i = 0; i < sub.length(); i++) {
                if (a[(int) sub.charAt(i)] == 0) {
                    a[(int) sub.charAt(i)] = 1;
                    permutation((fixed + sub.charAt(i)), sub.substring(0, i) + sub.substring(i + 1, sub.length()));
                }
            }
        }
    }
}