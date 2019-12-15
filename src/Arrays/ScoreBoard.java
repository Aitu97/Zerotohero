package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ScoreBoard {

    public static void main(String[] args) {

        char [] teams= {'A', 'B', 'C'};

        //user should input score number for each team
        //please enter score for team A
        //please enter score for team B
        //please enter score for team C
        //output
        //A***
        //B*****
        //C*

        Scanner input=new Scanner(System.in);
        System.out.println("please enter score for team A");
        int score=input.nextInt();
        System.out.println("please enter score for team B");
        int score2=input.nextInt();
        System.out.println("please enter score for team C");
        int score3=input.nextInt();

        for (char t: teams){
            if (t=='A') {
                String stars="";
                for (int i=0; i<score; i++) {
                    stars=stars+"*";
                }
                System.out.println(t+stars);
            }else if (t=='B'){
                String stars="";
                for (int i=0; i<score2; i++){
                    stars=stars+"*";
                }
                System.out.println(t+stars);
            }else if (t=='C'){
                String stars="";
                for (int i=0; i<score3; i++){
                    stars=stars+"*";
                }
                System.out.println(t+stars);
            }

        }


    }
}
