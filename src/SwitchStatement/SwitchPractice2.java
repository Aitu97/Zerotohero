package SwitchStatement;

import java.util.Scanner;

public class SwitchPractice2 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("please enter the value fruits");

        String fruits=input.nextLine();
        switch (fruits) {


            case "Strawberry":
                System.out.println("Matching value is "+fruits);
                break;

            case "Cranberry":
                System.out.println("Matching value is " +fruits);
                break;

            case "Chocolate":
                System.out.println("Matching value is "+fruits);
                break;

            case "Banana":
                System.out.println("Matching value is "+fruits);
                break;
            default:
                System.out.println("Fruit name is not matching");
                break;

        }
    }
}
