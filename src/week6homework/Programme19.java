package week6homework;
/**
 * Write a Java program to convert a given string into lowercase.
 *  Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 *  Output: the quick brown fox jumps over the lazy dog.
 */

import java.util.Scanner;

public class Programme19 {
    public static void main(String[] args){                         //main method
        Scanner obj10 = new Scanner(System.in);                     //scanner method

        System.out.println("Enter string into uppercase ");         //print statement to enter uppercase sentence
        String inputString = obj10.nextLine();                      //calling method
        String outputString = inputString.toLowerCase();            //code to convert uppercase to lowercase
        System.out.println("Output: " + outputString);              //print statement to display the outcome

        obj10.close();                                              //closing the scanner
    }
}
