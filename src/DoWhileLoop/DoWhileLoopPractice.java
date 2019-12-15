package DoWhileLoop;

import java.util.Scanner;

public class DoWhileLoopPractice {

    public static void main(String[] args) {


        int totalNum=4;

        do {
            System.out.println("Aitu");
            totalNum--;
        }while (totalNum>0);


        int totalNum1=4;

        do {
            System.out.println("Aitu");
            totalNum1--;
        }while (totalNum1<0);
        //only one time "Aitu" will be printing



        int totalNum2=4;

            System.out.println("Aitu");
            totalNum2--;
            while (totalNum2>0);
            // there is no output

        Scanner input=new Scanner(System.in);

        System.out.println("please enter the numbers");

        int number=input.nextInt();
        int number1=input.nextInt();
        int count=1;

        do {
            System.out.println(count+ " print the numbers between");
            count++;
        }while (number<=number1);
        count++;




    }
}
