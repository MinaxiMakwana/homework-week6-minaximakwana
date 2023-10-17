package week6homework;

import java.util.Scanner;

/** Write a program to insert any temperature value in degree Fahrenheit and
 convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 *
 */
public class Programme7 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);                       //use of scanner
        System.out.println("Enter temperature in fahrenheit: ");
        double degree = obj.nextInt();                              //using double because it Stores fractional numbers. Sufficient for storing 15 decimal digits
        calculateTemp(degree);
        obj.close();
    }

    public static void calculateTemp(double temp) {
        double degree = (temp - 32) * 5 / 9;                                 //using the given formula to calculate temp into degree
        System.out.println(temp + "°F is equal to " + degree + "°C.");      //print statement to see the output
    }
}
