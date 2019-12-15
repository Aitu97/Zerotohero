package StringPackage;

public class StringEquals {

    public static void main(String[] args) {

        String company="TransUnion";

        System.out.println(company.equals("TransUnioN "));

        // for primitive data types we are using logical operators
        //==, >=, <=, !=
        // String to be able compare values we are using
        // startWith, endWith, equal, contains

        System.out.println(company.equalsIgnoreCase("TRANSUNION"));




    }
}
