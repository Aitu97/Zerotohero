package ScannerPackage;

import java.util.Scanner;

public class MoneyTransaction {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // input three times the money amounts 500, 1000, 1500
        // I bought phone I spent 750
        // I bought used computer and I spent 300
        // Calculate how much money I have in my  saving account?

        System.out.println("please provide the first amount");
        double first=input.nextDouble();

        System.out.println("please provide the second amount");
        double second=input.nextDouble();

        System.out.println("Please provide the third amount");
        double third=input.nextDouble();

        double totalSaving=first+second+third;

       System.out.println("please provide total Saving"+totalSaving);


        System.out.println("please enter price for phone ");
        double phonePrice=input.nextDouble();

        System.out.println("please enter computer price ");
        double computerPrice=input.nextDouble();

        double totalSpending=phonePrice+computerPrice;
        System.out.println("Total spending is "+totalSpending);

        double leftAmount=totalSaving-totalSpending;

        System.out.println("the amount left after spending "+leftAmount);

    }
}
