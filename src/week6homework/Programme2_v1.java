package week6homework;
/**
 * 2. Write a Java programme using the following steps.
 * 2.1 Declare two static variables
 * 2.2 Declare one static method
 * 2.3 Call both static variables into the static method inside the print statement.
 * 2.4 Declare the Main method.
 * 2.5 Call the static method into the Main method and Run the programme.
 */
public class Programme2_v1 {
    static int x = 15;                              // static variable - variable holds the memory
    static String name = "My homework - Week 6 - Second answer";

    //calling both static variables into the static method inside the print statement
    public static void main(String[] args) {         //main method
        m10();                                      //calling the static method into the static main method - added on 19.10.2023
    }
    private static void m10() {                     //amended on 19.10.2023
        System.out.println(x);
        System.out.println(name);
    }
}

