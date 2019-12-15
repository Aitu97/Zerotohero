package Methods;

import java.util.Scanner;

public class testEvenOdd {

    public static void main(String[] args) {

        EvenOdd evenOdd=new EvenOdd();

        Scanner input=new Scanner(System.in);
        System.out.println("please enter your number");

        int number=input.nextInt();

        System.out.println("your number is even: "+evenOdd.isEven(number));
        System.out.println("your number is odd: "+evenOdd.isOdd(number));
    }
}
