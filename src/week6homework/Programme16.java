package week6homework;
/**
 * Write a Java program to add two binary numbers.
 * Input Data:
 * Input first binary number: 10
 * Input second binary number: 11
 * Expected Output:
 * Sum of two binary numbers: 101
 */
import java.util.Scanner;

public class Programme16 {
    public static void main(String [] args) {                  //main method
        Scanner obj7 = new Scanner(System.in);                 //scanner method

        System.out.println("Enter first binary number");       //print statement to enter first binary number
        String first = obj7.nextLine();                        //calling variable

        System.out.println("Enter second binary number");      //print statement to enter second binary number
        String second = obj7.nextLine();

        int num1 = Integer.parseInt(first,2);            //adding two binary numbers code
        int num2 = Integer.parseInt(second,2);

        int output = num1 + num2;                             //addition of two binary number

        System.out.print(Integer.toBinaryString(output));     //print statement to display the output
        obj7.close();                                         //closing scanner
    }
    }

