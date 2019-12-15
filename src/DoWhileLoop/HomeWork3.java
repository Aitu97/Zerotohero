package DoWhileLoop;

import java.util.Scanner;

public class HomeWork3 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);


        int number=3;
        String star="*";
        while(number>0) {
            System.out.println(star);
            star += "**";
            number--;
        }
        int number2=3;
        while (number2>0){
            star=star.substring(0, star.length()-2);
            System.out.println(star);
            number2--;
        }




    }
}
