package week6homework;

/**
 * Write a Java program that takes three numbers as input to calculate and
 * print the average of the numbers.
 */

import java.util.Scanner;

public class Programme13 {
    public static void main(String[] args) {                            //main method
        Scanner obj5 = new Scanner(System.in);                          //scanner method
        System.out.println("Enter the first number: ");                 //print statement to enter first number
        double num1 = obj5.nextDouble();                                // calling the method

        System.out.println("Enter the second number: ");                //print statement to enter first number
        double num2 = obj5.nextDouble();

        System.out.println("Enter the third number: ");                 //print statement to enter first number
        double num3 = obj5.nextDouble();

        double avg = (num1 + num2 + num3) / 3;                          //double code to calculate the average number
        System.out.println("Average of three numbers : " + avg);        //print statement to see the output

        obj5.close();                                                   //closing the scanner
    }
}
