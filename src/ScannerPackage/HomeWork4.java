package ScannerPackage;

import java.util.Scanner;

public class HomeWork4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please provide three input number");

        int number1=input.nextInt();

        int number2=input.nextInt();

        int number3=input.nextInt();

        boolean equal=number1==number2 && number2==number3;

        System.out.println("Are they equal to each other? " +equal);









    }
}
