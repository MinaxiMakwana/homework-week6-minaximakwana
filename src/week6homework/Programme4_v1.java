package week6homework;
/**
 * 4. Write a Java programme using the following steps.
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the
 * print statement
 * 4.5 Declare the Main method
 * 4.6 Call both instance and static methods into the Main method and run the programme
 */
public class Programme4_v1 {
    int a = 10;                                             // instance variable
    int b = 20;
    static int c = 30;                                      // static variable
    static int d = 40;

    public static void main(String[] args) {                // Main method
        Programme4_v1 obj11 = new Programme4_v1();
        Programme4_v1 m1 = new Programme4_v1();
        m2();

    }
    public static void m2() {                               //static method
        Programme4_v1 obj11 = new Programme4_v1();
        System.out.println(obj11.a);
        System.out.println(obj11.b);
        System.out.println(c);
        System.out.println(d);
        }
    public void m1(){                                       //instance method
        System.out.println(a);
        System.out.println(b);
        System.out.println(Programme4_v1.c);
        System.out.println(Programme4_v1.d);
    }
    }

