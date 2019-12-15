package ScannerPackage;

import java.util.Scanner;


    public class ProjectDay3 {
        public static void main(String[] args){

        Scanner input = new Scanner(System.in);
            System.out.println("Input three Strings");
        String first = input.nextLine();
        String second = input.nextLine();
        String third = input.nextLine();
            System.out.println("Initials of three Strings are "+first.charAt(0)+second.charAt(0)+third.charAt(0));
            System.out.println("Index of letter 'e' is "+first.indexOf('e')+" "+second.indexOf('e')+" "+third.indexOf('e'));
            System.out.println("Last character of each String is "+first.charAt(first.length()-1)+" "+second.charAt(second.length()-1)
                    +" "+third.charAt(third.length()-1));
            System.out.println(first.toUpperCase()+" "+second.toUpperCase()+" "+third.toUpperCase());
    }

}