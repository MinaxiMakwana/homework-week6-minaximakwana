package week6homework;

/*
 * Write a program to convert the upper case to lower case
 */

import java.util.Scanner;

public class Programme9 {
    public static void main(String[] args){                         //main method
        Scanner obj2 = new Scanner(System.in);                      //scanner method
        System.out.println("Enter the text in uppercase: ");        //print statement to ask user to enter sentence
        String name = obj2.nextLine();
        System.out.println(name.toLowerCase());                     //using toLowercase code to convert text into lowercase
        obj2.close();                                               //closing the object
    }
}
