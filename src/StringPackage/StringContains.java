package StringPackage;

import java.util.Scanner;

public class StringContains {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        String name="236 - Muammer";

        boolean condition=name.startsWith("236");

        System.out.println(condition);

        boolean condition2=name.endsWith("r");

        System.out.println(condition2);

        boolean codition3=name.contains("-");

        System.out.println(codition3);

        //using scanner input your name and check your name contains given value
        //F - yourname
        //M - yourname
        // check start with F if you are female
        // check start with M if you are male
        // check input contains your name or not


        System.out.println(" please Enter my gender name and year");
        String myName=input.nextLine();

        boolean condition4=myName.startsWith("F");
        System.out.println(condition4);

        boolean condition5=myName.contains("A");
        System.out.println(condition5);

        boolean condition6=myName.endsWith("97");
        System.out.println(condition6);
    }
}
