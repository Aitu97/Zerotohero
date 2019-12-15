package PolymorphysymOOP;

public class test {

    public static void main(String[] args) {


        // reference side has to be Super class
        // object side has to be Child class
        Super child=new GrandChild();
        child.myMethod();
        child.staticMethod();

        System.out.println("===============");

        Child child1=new GrandChild();
        child1.childMethod();
        child1.myMethod();
        child1.staticMethod();

        System.out.println("===============");

        Super child2=new GrandChild();
        ((Child)child2).childMethod();
        ((Child)child2).staticMethod();
        ((GrandChild)child2).staticMethod();

    }
}
