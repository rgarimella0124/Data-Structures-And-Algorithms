package ReverseInteger;
import java.util.Scanner;

public class Solution {

    public static void main(final String args[]) {
       //input number to reverse
        System.out.println("Please enter number to be reversed using Java program: ");
        final Scanner sc=new Scanner(System.in);
        final int number = sc.nextInt();
        sc.close();
        final int reverse = reverse(number);
        System.out.println("Reverse of number: " + number + " is " + reverse(number));  
   
    }
 
    /*
     * reverse a number in Java using iteration
     * @return reverse of number
     */
    public static int reverse(int number){
        int reverse = 0;
        int remainder = 0;
        do{
            remainder = number%10;
            reverse = reverse*10 + remainder;
            number = number/10;
         
        }while(number > 0);
     
        return reverse;
    }

}