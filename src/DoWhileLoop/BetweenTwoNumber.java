package DoWhileLoop;

import java.util.Scanner;

public class BetweenTwoNumber {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("please enter the numbers");

        int number=input.nextInt();
        int number1=input.nextInt();

        do {
            System.out.println( " print the numbers between");
            number++;
        }while (number<=number1);


    }
}
