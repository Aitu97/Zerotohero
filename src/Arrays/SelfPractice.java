package Arrays;

public class SelfPractice {

    public static void main(String[] args) {

        int [] []  num={{97, 55}, {34,65 }};
        int [] []  num2={{22, 35}, {66, 75}};

        for (int []  outer: num){
            for (int  outer1: outer){
                System.out.println(outer1);
            }
        }
        for (int [] outer: num2){
            for (int outer1: outer){
                System.out.println(outer1);
            }
        }
        System.out.println("-------------");

        System.out.println(num[0][1]);
        System.out.println(num[1][0]);
        System.out.println(num2[0][0]);
        System.out.println(num2[1][1]);



    }
}
