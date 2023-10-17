package week6homework;

/**
 * 2. Write a Java programme using the following steps.
 * 2.1 Declare two static variables
 * 2.2 Declare one static method
 * 2.3 Call both static variables into the static method inside the print statement.
 * 2.4 Declare the Main method.
 * 2.5 Call the static method into the Main method and Run the programme.
 */
public class Programme2 {

    static int x = 15;                              // static variable - variable holds the memory
    static String name = "My homework - Week 6 - Second answer";
                                                    //calling both static variables into the static method inside the print statement
    public static void main(String[] args){         //main method
        System.out.println(x);
        System.out.println(Programme2.x);
        System.out.println(name);
        System.out.println(Programme2.name);
    }
                                                    // static to static is direct calling
    public void m1(){
        System.out.println(x);
        System.out.println(Programme2.x);           //print statement
    }
}
