package GCD;

import java.util.Scanner;

public class Solution {

    public static void main(final String args[]) {

        // Enter two number whose GCD needs to be calculated.
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number to find GCD");
        final int number1 = scanner.nextInt();
        System.out.println("Please enter second number to find GCD");
        final int number2 = scanner.nextInt();
        scanner.close();
        System.out.println("GCD of two numbers " + number1 + " and " + number2 + " is :" + findGCD(number1, number2));

    }

    /*
     * Java method to find GCD of two number using Euclid's method
     * 
     * @return GDC of two numbers in Java
     */
    private static int findGCD(final int number1, final int number2) {
        // base case
        if (number2 == 0) {
            return number1;
        }
        return findGCD(number2, number1 % number2);
    }

}