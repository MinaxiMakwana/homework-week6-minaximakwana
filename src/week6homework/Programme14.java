package week6homework;

/**
 * Write a Java program to print the area and perimeter of a rectangle.
 * Test Data:
 * Width = 5.5 Height = 8.5
 *  Expected Output:
 * Area is 5.6 * 8.5 = 47.60
 * Perimeter is 2 * (5.6 + 8.5) = 28.20
 */

import java.util.Scanner;

public class Programme14 {
    public static void main(String[] args){                             //main method
        Scanner obj6 = new Scanner(System.in);                          //scanner method

        System.out.println("Enter the height of the rectangle");        //print statement to enter the height of the rectangle
        float height = obj6.nextFloat();

        System.out.println("Enter the width of the rectangle");          //print statement to enter the width of the rectangle
        float width = obj6.nextFloat();

        float area = height * width;                                    //float type to calculate the area
        float perimeter = 2 * (height + width);                         //formula code
        System.out.println("Area is: " + area);                         //print statement to display area calculation
        System.out.println("Perimeter is: " + perimeter);               //print statement to display perimeter
        obj6.close();                                                   //closing scanner

    }
}
