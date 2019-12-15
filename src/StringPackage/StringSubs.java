package StringPackage;

public class StringSubs {

    public static void main(String[] args) {


        String patientInfo="45 - Walnut - Jessica";

        System.out.println(patientInfo.substring(5));

        System.out.println(patientInfo.substring(5, 11));

        System.out.println(patientInfo.substring(5, 5));

        // patientInfo.substring(5, 4);
        // --> java will throw the exception. (runtime error.)

        System.out.println(patientInfo.length());
        // length is 21
        // last index number is 21

        // patientInfo.substring(5, 24) --> it will throw an exception

        System.out.println(patientInfo.substring(5, 12));


    }
}
