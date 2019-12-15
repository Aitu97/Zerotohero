package IfStatement;

import java.util.Scanner;

public class HomeWorkTuesday {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("please enter the Item's price");
        int price=input.nextInt();

        System.out.println("Please enter the Reviews");
        int review=input.nextInt();

        System.out.println("Please enter the Star rating");
        int starRating=input.nextInt();

        if (price<50 && review>200 && starRating>4){
            System.out.println("Print product on the first page");
        }else if (price>50 && review>200 && starRating>4){
            System.out.println("Print product on the second page");
        }else if (price>50 && review<200 && starRating>4){
            System.out.println(" Print product on the third page");
        }else if (price>50 && review<200 && starRating<4 && starRating>2){
            System.out.println("Print product on the forth page");
        }else System.out.println("Remove the product from the Amazon");




    }
}
