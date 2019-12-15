package IfStatement;

import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.Scanner;

public class FalcaoTransfer {

    public static void main(String[] args) {

        // Microphone from amazon (Tonor Dynamic Karaoke)
        // using scanner you need input the star, review number, price mic
        // equals to 4 star or more , more than 100 review, price should be less 20$
        // if your condition is true print i can buy the Tonor mic
        // else print I can not buy the Tonor


        Scanner input=new Scanner(System.in);

        System.out.println("please enter the star");
        int  star=input.nextInt();

        System.out.println("please enter the review");
        int review=input.nextInt();

        System.out.println("Please enter the price");
        int price=input.nextInt();

        if (star>=4 && review>100 && price<=20) {
            System.out.println("i can buy the mic");
        } else {

            System.out.println(" i can not buy the mic");
        }

        // first Galatasaray should pay 3mil to the club
        // Gal should pay 5 mil to Falcao

        System.out.println("Please enter the Galatasaray Budget");

        int galataBudget = input.nextInt();

        System.out.println("Please enter Player Salary");

        int playerSalary = input.nextInt();

        if (galataBudget == 30000000 && playerSalary == 50000000) ;

        System.out.println("Falcao can come to Galatasaray");









    }
}
