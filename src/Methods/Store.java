package Methods;

import java.util.Scanner;

public class Store {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("please enter the quantity?");
        int quantity=input.nextInt();
        System.out.println("please enter the price?");
        int price=input.nextInt();

        ProfitCalculator pc=new ProfitCalculator();
        if (quantity<20){
            System.out.println(pc.sell(price,quantity));
            System.out.println("there's no discount, if you want to buy more 20 or more.");

        }else if(quantity>=20 && quantity<40){
            System.out.println(pc.sell10dis(price,quantity));
            System.out.println("your price includes 10% discount");
        }else if (quantity>=40){
            System.out.println(pc.sell20dis(price,quantity));
            System.out.println("your price includes 20% discount");
        }else {
            System.out.println("your quantity or price is invalid!");
        }

        // small 2
        // medium 4
        // large 5
    }
}
