package IfStatement;

import java.util.Scanner;

public class ClassWork {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("please enter the average score");
        int score=input.nextInt();

        if (score>=0 && score>=20 ){
            System.out.println("The average score is grade grade F");
        } else if (score >= 20 && score >= 40){
            System.out.println(" the average score is grade D");
        } else if (score>=40 && score>=60){
            System.out.println("the average score is grade C");
        } else if (score>=60 && score>=80){
            System.out.println("the average score is grade B ");
        } else if (score>=80 && score<=100){
            System.out.println("the average score is grade A");
        } else {
            System.out.println( "the score is not define");
        }



    }

}


