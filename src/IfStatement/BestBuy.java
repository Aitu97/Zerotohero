package IfStatement;

import java.util.Scanner;

public class BestBuy {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        double phonePrice=1000;

        System.out.println("please make a phone payment");

        double paymentAmount=input.nextDouble();

        if(paymentAmount>=phonePrice){
            System.out.println("you can buy the phone");
        }else if(paymentAmount<phonePrice){
            double restAmount=phonePrice-paymentAmount;
            System.out.println("Please enter the rest of the money"+restAmount);
            double restPayment=input.nextDouble();
            if(restPayment>=restAmount){
                System.out.println("you can buy the product");
            }else {
                System.out.println("you cannot buy the product");
            }
        }
    }





        }




