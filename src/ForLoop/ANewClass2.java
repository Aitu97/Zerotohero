package ForLoop;

import java.util.Scanner;

public class ANewClass2 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("enter the number");
        int number=input.nextInt();

       // String star="*";
        for (int i=1; i<=number; i++){
            System.out.println(i+ " *");

            number--;
        }
    }
}
