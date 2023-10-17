package week6homework;

public class Programme4 {

    int a = 10;                                     // instance variable
    int b = 20;
    static int c = 30;                              // static variable
    static int d = 40;


    public static void main (String[] args) {      // Main method
        Programme4 obj = new Programme4();
        obj.myMethod();
        m1();
    }

    public void myMethod(){                         // instance method
        System.out.println(a);
        System.out.println(b);
    }

    public static void m1(){                      //static method
        System.out.println(c);
        System.out.println(d);
    }
}

