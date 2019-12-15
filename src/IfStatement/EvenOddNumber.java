package IfStatement;

import java.util.Scanner;

public class EvenOddNumber {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int num=15;

        int num1=14;

        if (num % 2== 0 ){
            System.out.println(num+ "is even number");
        }else {
            System.out.println(num+ "is odd number");
        }


        int num2=10;
        int num3=15;

        while(num2<=num3){
            //print the number if it is even number
            System.out.println(num2);
            num2++;
            if (num2%2==0){
                System.out.println(num2);
            }
            num2++;


        }



    }
}
