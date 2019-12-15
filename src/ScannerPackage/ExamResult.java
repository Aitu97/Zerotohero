package ScannerPackage;

import java.util.Scanner;

public class ExamResult {

    public static void main(String[] args) {

        //you need to enter three different exam result 70, 45, 90
        // if average is equals to 70 or more than 70
        // student should attend all the classes
        // student should complete al least 6 assignment
        // Student is able to go to next semester or not


        Scanner input = new Scanner(System.in);

        System.out.println("please provide exam results");
        int exam1=input.nextInt();

        int exam2=input.nextInt();

        int exam3=input.nextInt();

        int total=exam1+exam2+exam3;

        System.out.println("Total result "+total);

        int total1=total/3;
        System.out.println("Total of the exam result "+total1);







    }
}
