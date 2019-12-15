package DoWhileLoop;

import java.util.Scanner;

public class DoWhileHomework {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("please enter the number");

        int number=input.nextInt();
        int number1=input.nextInt();
        int count=1;

        do {
            System.out.println("*******");
            count++;
        }while (number>=number1);
        count++;


    }
}
