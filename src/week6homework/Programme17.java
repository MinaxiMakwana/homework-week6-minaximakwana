package week6homework;

import java.util.Scanner;

/**
 * Write a Java program to convert a decimal number to binary number.
 * Input Data:
 *  Input a Decimal Number : 5
 * Expected Output
 * Binary number is: 101
 */


public class Programme17 {
    public static void main (String [] args){                   //main method
        Scanner obj8 = new Scanner(System.in);                  //scanner method

        System.out.println("Enter decimal number");             //print statement to enter decimal number

        int decimal = obj8.nextInt();                           //calling method
        obj8.close();                                           //closing scanner

        int[] binary = new int[20];                             //code to calculate the decimal number to binary number
        int index = 0;
        while (decimal > 0) {
            binary[index++] = decimal % 2;
            decimal /= 2;
        }
        System.out.print("Binary number is: ");                 //print statement to display the binary number
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(binary[i]);
        }
    }
}
