package IfStatement;

import java.util.Scanner;

public class NestedStatement {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("do you have a passport?");

        boolean passport=input.nextBoolean();

        if (passport){

            System.out.println("do you have a ticket?");

            boolean ticket=input.nextBoolean();

            if (ticket){

                System.out.println("you can come to the US-1");

            }else {
                System.out.println("you can not come to the US-2");
            }

        }else {
            System.out.println("you can not come to US-3");
        }






    }



}
