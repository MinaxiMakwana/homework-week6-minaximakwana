package week6homework;

import java.util.Scanner;

/**
 * Write a program to enter any radius value of the circle and find out the
 * area.(Formula of Area A=PI*r*r)
 */
public class Programme6 {
    public static void main(String[] args) {                   //main method
        Scanner obj = new Scanner(System.in);                  //scanner method
        System.out.println("Enter the radius: ");              //print statement to tell user to enter radius number
        double radius = obj.nextInt();                         //double - Stores fractional numbers. Sufficient for storing 15 decimal digits
        calculateArea(radius);
        obj.close();                                           //closing the scanner
    }

    public static void calculateArea(double rad) {
        double areaA = Math.PI * rad * rad;                             //using maths method to calculate PI
        System.out.println("The area of the circle is: " + areaA);      //print statement which will display the answer
    }
}
