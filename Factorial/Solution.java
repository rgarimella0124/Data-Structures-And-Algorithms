package Factorial;

import java.util.Scanner;

public class Solution {
    static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return (n * factorial(n - 1));
    }

    public static void main(String args[]) {
        int fact = 1;
        System.out.println("Ënter the Number");
        final Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();// It is the number to calculate factorial
        scanner.close();
        fact = factorial(number);
        System.out.println("Factorial of " + number + " is : " + fact);
    }
}