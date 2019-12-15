package StringPackage;

public class StringMethods {

    public static void main(String[] args) {

        String sName="techtorial";
        int num=1;

        num++;

        System.out.println(num);

        System.out.println(sName.toUpperCase());

        //string is immutable
        System.out.println(sName); // techtorial

        sName=sName.toUpperCase(); // String is assigned again

        System.out.println(sName); // TECHTORIAL

        //difference between primitive data types and String
        // 1- string is immutable
        // 2- Primitive data types are mutable.
        // 3- String should be reassigned to be able to change

        String student="ARSLAN";

        System.out.println(student.toLowerCase()); // arslan

        student=student.toLowerCase();

        System.out.println(student); // lower case arslan

        student=student+" Kabul";
        // = it means assignment in java
        // == it means is equal to (comparison operator)
        System.out.println(student);



    }
}
