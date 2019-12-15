package Arrays;

import java.util.Arrays;

public class SortString {

    public static void main(String[] args) {

        String [] letters={"b","aa","ab","w","q","c","p","A"};

        Arrays.sort(letters);
        //arrays.sort is sorting string and numbers doesnt matter
        System.out.println(Arrays.toString(letters));

        System.out.println(Arrays.binarySearch(letters,"A"));
        // if u dont have a letter "d" is gonna give u a -5 cuz its 5th element


    }
}
