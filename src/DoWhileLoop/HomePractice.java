package DoWhileLoop;

import java.util.Scanner;

public class HomePractice {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("enter the number");

        int number=input.nextInt();

        String star="*";
        while (number>=1){
            System.out.println(star);
            star+="*";
            number--;


        }
    }
}
