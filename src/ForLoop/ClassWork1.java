package ForLoop;

import java.util.Scanner;

public class ClassWork1 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("enter the total number");

        int number=input.nextInt();

        System.out.println(" enter the numbers "+number+ " times");

        int num1=input.nextInt();



        for (int i=0; i<number-1; i++) {
            // this loop needs to run 5 times
            int num2=input.nextInt();
            if (num2>num1){

                num1=num2;
            }
        }
        System.out.println(num1);


      //Homework find the smallest number print it
    }
}
