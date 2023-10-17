package week6homework;
/**
 * 1. Write a Java programme using the following steps.
 * 1.1 Declare two instance variables.
 * 1.2 Declare one instance method.
 * 1.3 Call both instance variables into the instance method inside the print statement.
 * 1.4 Declare the Main method.
 * 1.5 Call the above instance method into the Main method and Run the programme.
 */

//A Class is like an object constructor, or a "blueprint" for creating objects
public class Programme1 {

    int x = 14;                                              // x is an Instance or global variable
    String name = "My homework - Week 6 -  First answer";   //name is a instance or global variable

    public static void main(String[] args){                 //main method
        Programme1 obj = new Programme1();                  //instance to instance is direct calling
        System.out.println(obj.x);
        System.out.println(obj.name);                        //calling the instance method into the main method
    }
    public void myMethod(){
        Programme1 v1 = new Programme1() ;
        System.out.println(v1.x);                           //print statement
        System.out.println(v1.name);
    }
}





