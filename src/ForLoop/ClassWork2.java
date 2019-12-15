package ForLoop;

import java.util.Scanner;

public class ClassWork2 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("enter the number");

        int number=input.nextInt();

        if (number<40 && number>10){

            for (int i=number; i<=40; i++)
                System.out.println(i);
            System.out.println(number+ " is in the range");
        }else {
            System.out.println(number+ " is not in the range");
        }

        //1- the number is in the range or not (give the number btwn 10 to 40)
        //2- the number is not in the range (give the number out of 10 to 40)
        // upper limit 40, lower  limit 10.


    }
            }