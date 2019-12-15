package ScannerPackage;

import java.util.Scanner;

public class HomeWorkLogical {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println(0); //false

        System.out.println(5+4<3&&7+3<=20); //false
        /* 5+4<3=false
           7+3<=20=true
         */
        System.out.println('a'!='b'-1); //true

        System.out.println(!(7==7));//false

        System.out.println(3%2); //1
        /* reminder
          1+1=2+1
         */
        System.out.println("!1 || !0"); //false

        System.out.println('a'==97); //true
        // 'a'==97 true --> 97==97

        int x=4;
        int y=3;
        // !(x<5&&y==3);  //true
        // !(x>1||y!7);

       boolean result=!(x<5&&y==3);

       //boolean result1=!(x>=1||y!7);

        /*
        !x<5 && y==3
        true && true
        */














    }
}
