package ConstructorPractice;

public class ComputerTest {

    public static void main(String[] args) {

        ComputerClass c=new ComputerClass(); // i called no argument constructor

        ComputerClass c1=new ComputerClass("Apple", "OS", "MacBook", "Pro");

        ComputerClass c2=new ComputerClass(2015, 8, 13);

        //immutable class
        // my instance variables should be private
        // i need to crate only getter
        // we need set the value using the constructor

        System.out.println(c.getName());

        System.out.println(c.getBrand());

        c.setName("HP");

        System.out.println(c.getName());

        c.setName("Asus");

        System.out.println(c.getName());

        System.out.println(c1.getName()); // apply

        c1.setName("Acer");

        System.out.println(c1.getName()); // acer

        System.out.println(c2.getName());

        System.out.println(c.getMemory());

        c.setMemory(15);

        //create array store the computers c, c1, c2.
        // and print the memory for all computer from array

        ComputerClass [] computerClasses= {c, c1, c2};// if i have more comp i need loop.
          for (ComputerClass cc: computerClasses )



            System.out.println(cc.getMemory());





    }
}
