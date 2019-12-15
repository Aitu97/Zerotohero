package Exceptions;

public class Error {

    public static void myMethod(){
        System.out.println("im inside of my method");
        myMethod();
    }

}
