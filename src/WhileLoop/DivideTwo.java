package WhileLoop;

import java.awt.image.ComponentSampleModel;
import java.util.Scanner;

public class DivideTwo {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("enter the number");

        int number=input.nextInt();

        int count=0;

        while (number>0){
           number= number/2; //9
           count=count+number; //9

        }
        System.out.println(count);








        System.out.println("enter the card amount");
        int amount=input.nextInt();

        int blueLine=2;
       int  count1=1;

        while (amount>blueLine){
            amount=amount-blueLine;
            System.out.println(count1+ " i can ride on blue line");
            count1++;

        }

    }
}
