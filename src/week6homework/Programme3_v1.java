package week6homework;
/** Write a Java programme using the following steps.
 *       3.1 Declare one instance and one static variable.
 *       3.2 Declare one instance method.
 *       3.3 Declare one static method.
 *       3.4 Call both instance and static variables into both instance and static methods inside the print statement.
 *       3.5 Declare the Main method.
 *       3.6 Call both instance and static methods into the Main method and run the programme
 */

public class Programme3_v1 {
    int a = 10;                                     // instance variable
    static int b = 20;                              // static variable


    public static void main (String[] args) {       // Main method
        Programme3_v1 obj = new Programme3_v1();
        obj.myMethod();                             //an object is an instance of a Java class, meaning it is a copy of a specific class.
        m1();
    }

    public void myMethod(){                          // instance method
        System.out.println(a);
        System.out.println(b);                       //corrected this line 19.10.2023
    }

    public static void m1(){                         //static method
        Programme3_v1 obj1 = new Programme3_v1();    //corrected this line 19.10.2023
        System.out.println(obj1.a);                  //to call instance variable into the static method - corrected this line 19.10.2023
        System.out.println(b);
    }
}

