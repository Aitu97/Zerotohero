package ForLoop;

import java.util.Scanner;

public class ForloopPractice {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("please enter the number");
        int  number=input.nextInt();
        for (int i=number; i<=100; i++){
            if (100%i==0){
                System.out.println(i);//1
            }


        }
    }
}
