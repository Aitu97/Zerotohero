package ForLoop;

import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("enter the perfect number");

        int number=input.nextInt();

        int sum=0;

        for (int i=1; i<number; i++){

            if (number%i==0){
                sum=sum+i;
            }
            System.out.println(sum);
        }
        if (sum==number){
            System.out.println(number+ " is perfect number");
        }else {
            System.out.println(number+ " is not perfect number");
        }
        //positive testing
        // once you enter the perfect number result should be is perfect number
        // negative testing
        //once you enter the not perfect number you should see the is not perfect number
        //give the string and it should not work






    }
}
