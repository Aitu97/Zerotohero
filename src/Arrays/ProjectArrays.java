package Arrays;

import java.util.Arrays;

public class ProjectArrays {

    public static void main(String[] args) {

        int [] numbers={3,9,55,73,99,2,10};
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        int n=numbers[numbers.length-1];
        System.out.println(n);

     }
    }

