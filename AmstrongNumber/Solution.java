package AmstrongNumber;

import java.util.Scanner;

public class Solution {
    public static void main(final String[] args) {
        int num, number, temp, total = 0;
        System.out.println("Ënter 3 Digit Number");
        final Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        scanner.close();
        number = num;

        for (; number != 0; number /= 10) {
            temp = number % 10;
            total = total + temp * temp * temp;
        }

        if (total == num)
            System.out.println(num + " is an Armstrong number");
        else
            System.out.println(num + " is not an Armstrong number");
    }
}