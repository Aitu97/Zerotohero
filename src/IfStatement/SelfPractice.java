package IfStatement;

import java.util.Scanner;

public class SelfPractice {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        //check that giving year is leap year or not.
        // if the year is leap year print leap year if it is not leap year print not leap year.

        //how do you find giving leap or not?
        // once you divide the year with 4 reminder should be 0.
        // once you divide with 100 reminder should be 0.
        // or once you divide with 400 reminder of the value is equals to 0 it is also leap year .

        System.out.println("Enter the year?");
        int year=input.nextInt();

        // boolean condition true


        if (year % 4 ==0 && year % 100 != 0 || year % 400 ==0)
            System.out.println("This year is leap");
        else
            System.out.println("This is not leap year");
        System.out.println("This is not leap year");// always will be executed
















    }
}
