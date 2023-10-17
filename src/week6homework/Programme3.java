package week6homework;

public class Programme3 {

    int a = 10;                                     // instance variable
    static int b = 20;                              // static variable

    // Main method
    public static void main (String[] args) {
        Programme3 obj = new Programme3();
        obj.myMethod();                             //an object is an instance of a Java class, meaning it is a copy of a specific class.
        m1();
    }


   public void myMethod(){
       System.out.println(a);
    }      // instance method
    public static void m1(){                        //static method
       System.out.println(b);
                                                    // here System.out.println(Programme3.b); also can be used to call
    }
   }

