package DoWhileLoop;

import java.util.Scanner;

public class HomeWork2 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("enter the numbers");
        int number=input.nextInt();
        int number1=input.nextInt();

        while (number<=number1){
            if (number % 2 == 0 && number1 % 7 == 0){
                System.out.println("numbers divided by 2 and 7 "+number);
            }
            number++;
        }






    }
}
