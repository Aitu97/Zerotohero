package PolymorphysymOOP;

public class GrandChild extends Child {

    @Override
    public void childMethod(){
        System.out.println("im child method in GrandChild class");
    }
    public static void staticMethod(){
        System.out.println("im static method in GrandChild class");
    }
}
