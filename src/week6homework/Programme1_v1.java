package week6homework;
/**
 * 1. Write a Java programme using the following steps.
 * 1.1 Declare two instance variables.
 * 1.2 Declare one instance method.
 * 1.3 Call both instance variables into the instance method inside the print statement.
 * 1.4 Declare the Main method.
 * 1.5 Call the above instance method into the Main method and Run the programme.
 */


public class Programme1_v1 {

    int x = 14;                                                 // x is an Instance or global variable
    String name = "My homework - Week 6 -  First answer";       //name is a instance or global variable

    public static void main(String[] args){                     //main method
        Programme1_v1 obj = new Programme1_v1();                //instance to instance is direct calling
        obj.myMethod();                                         //added on 19.10.2023
    }
    public void myMethod(){
        System.out.println(x);                                  //print statement
        System.out.println(name);
    }
}

