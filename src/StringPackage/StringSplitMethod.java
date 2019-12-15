package StringPackage;

import java.util.Arrays;

public class StringSplitMethod {

    public static void main(String[] args) {

        String schoolName="Techtorial Academy 2019 September April";

       String [] words = schoolName.split(" ");

        System.out.println(Arrays.toString(words));

        //first side is mane of string
        //second side is name of your array
        for (String word: words) {

            if (word.startsWith("A")){
                System.out.println(word);
            }

        }



        //split the string and print the year
        String date="09/16/2019";

        String  [] year = date.split("/");
        System.out.println(Arrays.toString(year));

        for (String year1: year){

            if (year1.startsWith("2")){
                System.out.println(year1);
            }
        }

        String startDate="09.16.2019";

        String [] startDates=startDate.split("\\.");
        System.out.println(Arrays.toString(startDates));
        System.out.println(startDates[0]);
        System.out.println(startDate.replace("1",""));
    }
}
