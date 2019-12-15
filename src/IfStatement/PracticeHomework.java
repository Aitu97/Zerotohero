package IfStatement;

import java.util.Objects;
import java.util.Scanner;

public class PracticeHomework {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the Class name");

        String className = input.nextLine();

        if (className.equalsIgnoreCase("Class C" )) {
            System.out.println("please enter the price between $50 and &70");
        }else if(className.equalsIgnoreCase("Class a" )) {
            System.out.println("please enter  the price between 80 and 110");
        }else if(className.equalsIgnoreCase("Class b" )){
            System.out.println("please enter  the price between 120 and 130");

            }
            double class1 = input.nextDouble();
           if (class1 >= 50 && class1 <= 70) {
               System.out.println("Column D Row 19");
           }else if(class1 >= 80 && class1 <= 110) {
               System.out.println("Column E Row 34");
           }else if(class1 >= 120 && class1 <= 130){
               System.out.println("Column R Row 15");

                //if (className.equals("Class B")){

                    //System.out.println("please enter the price between $70 and $90");
                    //double class2 = input.nextDouble();
                    //if (class2 >= 70 && class2 <= 90) {
//                        System.out.println("Column C Row 10");
//
//                        if (className.equals("Class A")) {
//                            System.out.println("please enter the price between $90 and 110");
//                            double class3 = input.nextDouble();
//                            if (class3 >= 90 && class3 <= 110) {
//                                System.out.println("Column A Row 5");
//
//                                System.out.println("please enter the price for ticket");
//                                double price=input.nextDouble();



                            }
                        }
                    }






