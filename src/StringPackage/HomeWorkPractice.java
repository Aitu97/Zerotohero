package StringPackage;

import java.util.Scanner;

public class HomeWorkPractice {

    public static void main(String[] args) {

       /* 1- Using scanner provide two String (for example: Real Estate ,
        Affiliate Marketing )
         * write the code to check first string and second string is equals to each other.
        check first letter of Strings are equals to each other.
        check length of the Strings are equals to each other
        check last letter of Strings are equals to each other.
        add 2019 in the beginning of the string.
        Output should be like 2019 Real Estate and 2019 Affiliate Marketing.
        Replace all the spaces with “-”
        Print partial of the String starting from 4. char to 8. char
        and using method chaining trim all the spaces, make all of them upper case
        */
        Scanner sc=new Scanner(System.in);

        System.out.println("please enter the two values");

        // if you have a space between the world we need to use the nextLine
        String real=sc.nextLine();
        String marketing=sc.nextLine();


        boolean equals=real.equalsIgnoreCase(marketing);

        System.out.println(equals);

        boolean firstLetter=real.charAt(0)==marketing.charAt(0);

        System.out.println(firstLetter);

        boolean length=real.length()==marketing.length();

        System.out.println(length);

        // All primitive data types we need to use logical operators
        // ==, >=, <=, <, >, !=
        // String to compare the values we can not use the logical operator

        //2019

        real="2019 "+real;
        marketing="2019 "+marketing;

        System.out.println(real);
        System.out.println(marketing);

        //2019-Real-Estate
        real=real.replace(" ", "-");
        marketing=marketing.replace(" ", "-");

        System.out.println(real);
        System.out.println(marketing);

        System.out.println(real.substring(4,8).trim().toUpperCase());
        System.out.println(marketing.substring(4,8).trim().toUpperCase());

















    }
}
