package IfStatement;

import java.util.Scanner;

public class IfHomework2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Homework 3- Shopping Application

        System.out.println("please enter number of tomatoes ");
        int tomato = input.nextInt();
        int priceTomato = 1;
        int totalPriceTom = tomato * priceTomato;
        System.out.println("Total price for tomato is = " + totalPriceTom);

        System.out.println("Please enter number of cucumbers ");
        int cucumber = input.nextInt();
        double priceCucumber = 0.50;
        double totalPriceCucumber = cucumber * priceCucumber;
        System.out.println("Total price for cucumber is = " + totalPriceCucumber);

        System.out.println("please enter number of carrot");
        int carrot = input.nextInt();
        double priceCarrot = 0.25;
        double totalPriceCarrot = carrot * priceCarrot;
        System.out.println("Total price for cucumber is = " + totalPriceCarrot);

        System.out.println("Please enter number for Eggplant");
        int eggplant = input.nextInt();
        int priceEggplant = 2;
        int totalPriceEggplant = eggplant * priceEggplant;
        System.out.println("Total price for eggplant is = " + totalPriceEggplant);


        double totalPriceVeg = totalPriceTom + totalPriceCucumber + totalPriceCarrot + totalPriceEggplant;
        System.out.println("total price for Veggie " + totalPriceVeg);

        if(totalPriceVeg >= 10) {
            totalPriceVeg = totalPriceVeg - totalPriceVeg * 0.10;
            System.out.println("You have 10% discount and you need to pay = " + totalPriceVeg);
        } else {
            System.out.println("You cant applay to 10% discount, you need to pay for veg " + totalPriceVeg);

        }




    }
}
