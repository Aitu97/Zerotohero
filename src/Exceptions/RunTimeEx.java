package Exceptions;

import java.util.Scanner;

public class RunTimeEx {

    public static void main(String[] args) {

        int[] numbers={5,3,4};

        System.out.println(numbers[2]);
        try{
            System.out.println(numbers[3]);
        }catch (Exception exception){
            System.out.println("this code throws exception");
        }
        System.out.println(numbers[1]);

        Scanner input=new Scanner(System.in);
        System.out.println("hey enter two number u want to divide: ");
        int num1=input.nextInt();
        int num2=input.nextInt();

        try {
            System.out.println(num1/num2);

        }catch (ArithmeticException e){
            System.out.println("u can not divide by zero");
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
           e.printStackTrace();
        }

        System.out.println("your code is finished");

        String name=null;
        try {
            name.toUpperCase();
        }catch (NullPointerException e){
            System.out.println("it is an exception");
        }




    }
}
