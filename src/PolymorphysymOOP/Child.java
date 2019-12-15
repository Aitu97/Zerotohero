package PolymorphysymOOP;

public class Child extends Super{

    @Override
    public void myMethod(){
      System.out.println("im inside of Child class");
}


    public static void staticMethod(){
        System.out.println("im static method from Child class");
    }

    public void childMethod(){
        System.out.println("im child method from child class");
    }







}
