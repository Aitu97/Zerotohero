package TernaryOperators;

public class TernaryPractice {

    public static void main(String[] args){

      int x=10;
      int y=5;
      int z=0;
      int k=2;
      //ternary operators
      //booleanExpression? value1: value2;

        System.out.println(x>5?8:9);

        System.out.println(y>x?8:9);

        System.out.println(x==y?(z=7):(z=3));

        System.out.println(z);

        System.out.println(x>y? k++ : ++k);
         // increased to the 3
        System.out.println(k);


        // NOTE: the values doesnt have to be same data types
        System.out.println(x<y ? 40 : "Hello World");

        z=3;

        System.out.println(x>y? ++z+z++ : z++ + ++z);

        System.out.println(z);

       // int s=x>y? 40 : "Hello"; // compile time error

        System.out.println(x>y ? 40 : "hello");
        System.out.println(10);
        System.out.println("hello");

        // NOTE: if you are assigning the value from the ternary operator
        // both side should be same data type.
        //how ever if you not assigning the value from the ternary from ternary operator
        // just printing it is not required to be same data types

        byte bt=10;
        short st=30;
        long ln=1000;
        int number=bt>st ? bt : st; // --> byte and short -->always automatically casting the


        double db=10.5;
        float fl=5.5f;

        double num1=db>fl ? db : fl;




    }
}
