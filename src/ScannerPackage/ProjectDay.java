package ScannerPackage;

import java.util.Scanner;

public class ProjectDay {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("please enter state name");

        String state=input.nextLine();

        System.out.println("input numbers letters of state "+state);

        int numbers=input.nextInt();

        boolean stateEqual=numbers==state.length();

        System.out.println("The numbers you entered is "+stateEqual);

        System.out.println("Enter a letter that you want to find a index of");
        String letter=input.next();

        System.out.println("the index of letter you asked is "+state.indexOf(letter));



    }
}
