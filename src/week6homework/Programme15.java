package week6homework;
/**
 * Write a Java program to swap two variables.
 */

import java.util.Scanner;

public class Programme15 {
    public static void main(String [] args){                                    //main method
        Scanner obj8 = new Scanner(System.in);                                  //scanner method

        System.out.println("Enter first value");                                //print statement to enter the first value
        int a = obj8.nextInt();                                                 //calling the method

        System.out.println("Enter second value");                               //print statement to enter the second value
        int b = obj8.nextInt();

        System.out.println("Before swapping a and b = " + a + " and " + b);     //print statement to show variables before swapping
        a = a + b;                                                              //identifying variables
        b = a - b;                                                              //identifying variables
        a = a - b;                                                              //identifying variables

        System.out.println("After swapping a and b = " + a + " and " + b);      //print statement to swap the variables
        obj8.close();                                                           //closing the scanner

    }
}
