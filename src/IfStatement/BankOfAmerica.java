package IfStatement;

import java.util.Scanner;

public class BankOfAmerica {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("please enter the username");

        String username=input.next();

        //username
        //password
        //captcha

        if (username.equals("Laluna")){

            System.out.println("please enter the password");

            String password=input.next();

            if (password.equals("DesPlaines21")){

                System.out.println("please enter the captcha");

                String captcha=input.next();

                if (captcha.equals("beam")){

                    System.out.println("welcome to bank of america");
                }else {
                    System.out.println("captcha is wrong");

                }
            }else {

                System.out.println("password is wrong");


            }
        } else System.out.println("username is wrong");

    }
}
