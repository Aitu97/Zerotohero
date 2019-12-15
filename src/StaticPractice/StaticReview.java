package StaticPractice;

public class StaticReview {

    //static instance variables
    //static method
    //static block
    //instance initializiation
    //it will run one time
    // it will run before everything  in class
    // to initialize the variables
    //it belongs to class


    static String name;
    {
        System.out.println("this is instance block");
    }
    static {
        System.out.println("this is static block");
    }

    public static void test()
    {

        //static int number = 10;
        System.out.println(name);
        System.out.println("this is static method");
    }
    public void test1(){
        System.out.println(name);
    }

    public static int add(int a, int b){
        int k=a+b;
        return k;
    }
    public static int substract(int a, int b){
        int c=a-b;
        return c;
    }
    public static int divide(int a, int b){
        int d=a/b;
        return d;
    }
    public static int muliply(int a, int b){
        int e=a*b;
        return e;
    }

}
