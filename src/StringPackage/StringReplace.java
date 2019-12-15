package StringPackage;

import java.util.Scanner;

public class StringReplace {

    public static void main(String[] args) {

        String success="dotentimesmore";

        success=success.replace('d', 'D');

        System.out.println(success);

        success=success.replace("ten", "eleven");

        System.out.println(success);

        success=success.replace('m', 'M');

        System.out.println(success);

        success=success.replace('X', 'M');
        // it will search the string to find oldChar or oldString
        // if it is not able to find it will not change the value.

        String achievement="    do ten times more    ";

        achievement=achievement.trim();

        System.out.println(achievement);

        // using scanner give the following value
        // "  Zero To Hero   "
        // return only "Hero"
        // trim the spaces
        // replace Zero with One
        // print all of them upper case
        // return true if its equals ignore to "zero to hero"

        Scanner input=new Scanner(System.in);

        System.out.println("Please enter value");

        String value=input.nextLine();

        value=value.trim();

        System.out.println(value);

        System.out.println(value.substring(8, 12));

        value=value.replace("Zero", "One");

        System.out.println(value);

        System.out.println(value.toUpperCase());

        System.out.println(value.equalsIgnoreCase("one to hero"));

        value=value.replace("One", "Zero");

        System.out.println(value);










    }
}
