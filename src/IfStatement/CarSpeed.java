package IfStatement;

import java.util.Scanner;

public class CarSpeed {

    public static void main(String[] args) {

        //using Scanner enter the five different input
        // 1- gasPedal -- true/false
        // 2- breakPedal -- true/false
        // 3-  gasPedalPercentage -- number
        // 4- enter current speed
        // 5- enter speed limit

        // increaseSpeed= cs<sl , gas pedal equals true,
        // gasPedalPercentage more than 20 percent
        // breakPedal should be false

        Scanner input=new Scanner(System.in);

        System.out.println("Please enter the five different input for car speed");


        int currentSpeed=input.nextInt();
        System.out.println("Please provide the current speed");

        int speedLimit=input.nextInt();
        System.out.println("please provide the speed limit");


        boolean gasPedal=input.nextBoolean();
        System.out.println("please provide the gas pedal");


        boolean breakPedal=input.nextBoolean();
        System.out.println("please provide the break pedal");



        boolean gasPedalPercentage=input.nextBoolean();















    }
}
