package ConstructorPractice;

public class NumberPractice {

    public int multiply(int num){

       return num*10;
    }

    public double reminder(int value){
        return value%4;
    }


    public static void main(String[] args) {

        int appleNumber=10;

        NumberPractice apple=new NumberPractice();

        System.out.println( apple.multiply(appleNumber)); //100

        System.out.println(appleNumber); // since method took the copy of the appleNumber.
        // Apple number value is not changing.

        appleNumber=apple.multiply(appleNumber); // 100

        System.out.println(appleNumber); // 100

        System.out.println(apple.reminder(appleNumber));

        System.out.println(appleNumber);
    }
}
