package IfStatement;

import java.util.Scanner;

public class OrderNumbers {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("please enter the numbers");

        int one=input.nextInt();
        int two=input.nextInt();
        int three=input.nextInt();
        int four=input.nextInt();

        if(one>two){
            int temp=one;//
            one=two;//
            two=temp;//

        }

        if (two>three){
            int temp=two;//temp=12
            one=three;//two=7
            three=temp;//three=12

        }
        if (one>three){
            int temp=one; //temp=4
            one=three; //
            three=temp; //
        }

        if (one>four){
            int temp=one; //temp=4
            one=four; //one=3
            four=temp; //four=4
        }

        if (two>three){
            int temp=two;
            two=three;
            three=temp;
        }

        if (two>four){
            int temp=two; //temp=7
            two=four; //two=4
            four=temp; //four=7
        }

        if (three>four){ // three=12, four=7
            int temp=three; //temp= 12
            three=four; //three=7
            four=temp; //four = 12
        } // one=3, two=4 , three= 7, four= 12

        System.out.println(""+ one+ "/n" + two+ "/n" + three + "/n" + four);
        System.out.println(""+four+ "/n "+ three+ "/n"+ two+ "/n"+ one);


    }
}
