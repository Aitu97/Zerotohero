package Arrays;

import java.util.Arrays;

public class addEmail {

    public static void main(String[] args) {

        String names[] = {"Lisa", "Kubat", "Yalcin", "Erkin", "Sema", "Kira"};

        //write a program that will convert this names
        // to emails and will save to array
        // for exp: [liza@gmail.com, kubat@gmail.com, ....]

        String [] emails=new String[names.length];

        for (int  i=0; i<names.length;  i++){
             emails[i]= names[i]+"@gmail.com";
        }
        System.out.println(Arrays.toString(emails));



    }
}
