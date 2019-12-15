package ScannerPackage;

import java.util.Scanner;

public class ScannerDayTwo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("please provide the numbers" );

        //provide two number and find the reminder of this two number and print

        int number1=input.nextInt();
        int number2=input.nextInt();
        int remainder=number1%number2;

        System.out.println("Reminder of the number is "+remainder);

        //


    }
}
