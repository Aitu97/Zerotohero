package SwitchStatement;

import java.util.Scanner;

public class AituPractice {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Please provide the siblings name");

        String siblings=input.nextLine();

        switch (siblings){

            case "1990":
                System.out.println("first siblings name is Arstan");
                break;

            case "1992":
                System.out.println("Second siblings name is Aijamal");
                break;

            case "1997":
                System.out.println("Third siblings name is Aitu");
                break;

            case "2001":
                System.out.println("Forth siblings name is Aidar");
                break;

            case "2010":
                System.out.println("Fifth siblings name is Aijan");
                break;

            default:
                System.out.println("There is no this name try again");

        }




    }
}
