package ForLoop;

import java.util.Scanner;

public class ClassWork {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("enter the number");
        int number=input.nextInt();

        int fac=1;

        for (int i=number; i>=1; i--){

            fac=fac*i;

    }
        System.out.println(fac);
        }

    }

