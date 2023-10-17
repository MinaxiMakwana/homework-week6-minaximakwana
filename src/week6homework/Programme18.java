package week6homework;
/**
 * Write a Java program to print the sum (addition), multiply, subtract, divide and
 * remainder of two numbers.
 * Test Data:
 * Input first number: 125
 * Input second number: 24
 * Expected Output :
 * 125 + 24 = 149
 * 125 - 24 = 101
 * 125 x 24 = 3000
 * 125 / 24 = 5
 * 125 mod 24 = 5
 */

import java.util.Scanner;

public class Programme18 {
    public static void main(String[] args){                                     //main method
        Scanner obj9 = new Scanner(System.in);                                  //scanner method

        System.out.println("Enter the first and second number");                //print statement to enter first and second number
        int num1 = obj9.nextInt();                                              //calling method
        int num2 = obj9.nextInt();

        int sum = num1 + num2;                                                  //code to calculate sum
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));        //display the sum output

        int subtract = num1 - num2;                                             //code to calculate subtract
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));        //display the subtract output

        int mul = num1 * num2;                                                  //code to calculate multiply
        System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));        //display the multiply output

        int divide = num1 / num2;                                               //code to calculate
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));        //display the divide output

        int remainder = num1 % num2;                                            //code to calculate
        System.out.println(num1 + " mod " + num2 + " = " + (num1 % num2));      //display the remainder output

        obj9.close();                                                           //closing scanner
    }
}
