package week6homework;
/**
 * Write a program to calculate the area of a triangle
 */

import java.util.Scanner;

public class Programme8 {
    public static void main(String[] args){                             //main method
        Scanner obj1 = new Scanner(System.in);                          //scanner method

        System.out.println("Enter the base of the Triangle: ");         //print statement to ask user to enter base detail
        double base = obj1.nextDouble();

        System.out.println("Enter the height of the Triangle: ");       //print statement to ask user to enter height of the triangle
        double height = obj1.nextDouble();

        double area = (base * height) / 2;
        System.out.println("Area of Triangle is : " + area);            //calculates the area of the triangle using the formula (width*height)/2

        obj1.close();
    }
}
