package week6homework;

/**
 * Write a program for a calculator with addition, subtraction, multiplication
 * and division methods all with parameters and use string concatenation
 * methods.(Note: Two static and Two instance methods.)
 */

import java.util.Scanner;
//scanner method is to receive user input and parse them into primitive data types such as int, double or default String
public class Programme5_v1 {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);                   //identifying new scanner with obj
        System.out.println();
        System.out.println("Please enter first number: ");
        int a = obj.nextInt();
        System.out.println("Please enter second number: ");
        int b = obj.nextInt();
        addition(a, b);                                         //addition method calling into main method
        Programme5_v1 t1 = new Programme5_v1();
        t1.subtraction(a, b);                                   // subtraction method calling into main method
        obj.close();                                            //making sure scanner is closed at the end
    }

    public static void addition(int a, int b) {
        int answer = a + b;                                     //addition method
        System.out.println("addition of two numbers " + a + " and "+ b + " is " + answer);
    }

    public void subtraction(int a, int b) {
        int answer = a - b;                                     //subtraction method
        System.out.println("subtraction of two numbers " + a + " and " + b + " is " + answer);
    }

    public void multiplication(int a, int b) {
        int answer = a - b;                                     //multiplication method
        System.out.println("multiplication of two numbers " + a + " and " + b + " is " + answer);
    }
    public void division(int a, int b) {
        int answer = a - b;                                     //division method
        System.out.println("division of two numbers " + a + " and " + b + " is " + answer);
    }
}
