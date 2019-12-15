package WhileLoop;

import java.util.Scanner;

public class SumofNumbers {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("please enter two numbers");

        int firstNumber=input.nextInt();

        int secondNumber=input.nextInt();

        int sum=0;

        //10 - 15
        //10 + 11 +12 +13
        while (firstNumber<=secondNumber){
          //  System.out.println(firstNumber);
            sum=sum+firstNumber;
            //sum= 0+10;  sum=10;
            firstNumber++;

        }
        System.out.println(sum);

        //Debugging. it is very important.
    }
}
