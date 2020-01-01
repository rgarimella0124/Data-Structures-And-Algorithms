package IntegerPalindrome;

import java.util.Scanner;
/**
 * Java program to check if number is palindrome or not.
 * A number is called palindrome if number and its reverse is equal
 * This Java program can also be used to reverse a number in Java
 */
public class Solution {
    public static void main(String args[]){
       
        System.out.println("Please Enter a number : ");
        Scanner sc = new Scanner(System.in);
       int palindrome=sc.nextInt();
        if(isPalindrome(palindrome)){
            System.out.println("Number : " + palindrome + " is a palindrome");
        }else{
            System.out.println("Number : " + palindrome + " is not a palindrome");
        } 
        sc.close();     
       
    }
    /*
     * Java method to check if number is palindrome or not
     */
    public static boolean isPalindrome(int number) {
        int palindrome = number; // copied number into variable
        int reverse = 0;
        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }
        // if original and reverse of number is equal means
        // number is palindrome in Java
        if (number == reverse) {
            return true;
        }
        return false;
    }

}