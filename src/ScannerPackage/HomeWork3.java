package ScannerPackage;

import java.util.Scanner;

public class HomeWork3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length and breadth to get the area of rectangle  ");

        double length = input.nextDouble();
        double breadth = input.nextDouble();
        int area = (int)(length*breadth);

        System.out.println("Area of the rectangle is "+area);


    }
}
