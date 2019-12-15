package IfStatement;

import java.util.Scanner;

public class IfHomeWork {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter the person's age");
        int age=input.nextInt();

        System.out.println("Enter the city");
        String city=input.next();
        boolean cityCon;
        if (city.equalsIgnoreCase("schaumburg")){
            cityCon=true;
        }else{
            cityCon=false;
        }

        System.out.println("Provide the average score");
        double averageScore=input.nextDouble();

        System.out.println("Does the person have citizenship");
        String citizenship=input.next();

        boolean citizenCondition;
        if (citizenship.equalsIgnoreCase("yes")){
            citizenCondition=true;
        }else{
            citizenCondition=false;
        }


        if (age>=14 && cityCon==true && averageScore>75 && citizenCondition==true ){
           System.out.println("I can go to the high school");
       }else {
           System.out.println("I can not go to the high school");
       }

    }
}

















