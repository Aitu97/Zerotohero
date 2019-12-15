package DoWhileLoop;

import java.util.Scanner;

public class HomeWork1 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("please enter the numbers");

        int number=input.nextInt();

        int number1=input.nextInt();

        int count=1;

        do {
            System.out.println(count+ " numbers between 1 to 100");
            number++;

        }while(number < number1  );

        if (number % number1 != 1 && number % 1 !=number){
            System.out.println(number+" is prime number");
        }else {
            System.out.println(number + " is not prime number");
        }




    }
}
