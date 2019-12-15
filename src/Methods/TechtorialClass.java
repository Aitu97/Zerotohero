package Methods;

import java.util.Scanner;

public class TechtorialClass {

    public static void main(String[] args) {
        arrayMethods arrayM=new arrayMethods();

        Scanner input=new Scanner(System.in);
        for (int i=0; i<arrayM.students.length; i++) {
            System.out.println("what is your name?");
            arrayM.studentName = input.next();
            arrayM.addStudent();
        }
        arrayM.printName();


    }
}
