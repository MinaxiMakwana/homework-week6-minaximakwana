package week6homework;
/**
 * Write a Java program that takes a number as input and prints its
 * multiplication table up to 10.
 * Test Data: Input a number: 8
 * Expected Output :
 * 8 x 1 = 8
 * 8 x 2 = 16
 * 8 x 3 = 24
 * ...
 * 8 x 10 = 80
 */

import java.util.Scanner;

public class Programme10 {
    public static void main(String[] args) {                                //main method
        Scanner obj3 = new Scanner(System.in);                              //scanner method
        System.out.println("Enter a number: ");                             //print statement to ask user to enter sentence
        int myNum = obj3.nextInt();
        int i;
        for (i = 1; i <= 10; i = i + 1) {                                   //loop code to calculate multiplication
            System.out.println(myNum + " x " + i + " = " + myNum * i);      //print statement to display times table
        }
            obj3.close();                                                   //closing the scanner
        }
    }
