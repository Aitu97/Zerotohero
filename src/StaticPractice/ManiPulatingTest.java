package StaticPractice;

import java.util.ArrayList;

public class ManiPulatingTest {

    public static void main(String[] args) {

      /*  TASK
        Create One class called ManipulateString
        Create instance a filled called mainString
        Create constructor with no argument
        create constructor with one argument and initialize the main String
        Method 1:
        Create method called sumNumber()
        take no parameter and it will get the sum of number found in String
        if there no number present in String it will return 0
        Method 2:
        Create method called getLetterList()
        Take no paramter and it will return the list of character present in String
        Store letters to the arraylist and return the arraylist(Note do not store the numbers which present in string)
        Create class called ManipulateStringTest with main method
                Create one object and call the methods.

       */

      ManipulateString str=new ManipulateString("M4T98KL1");
     int sumNumber= str.sumNumber();
        System.out.println(sumNumber);

       ArrayList<Character> letterList= str.getLetterList();

        System.out.println(letterList);







    }
}
