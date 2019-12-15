package StringPackage;

public class StringAdvance {

    public static void main(String[] args) {

        // 1st initialize the name
        String name="Muammer";

        // then re-assigning the mane
        name="Arslan";

        String sName=name+" Ali";

        String tName="Arslan";

        System.out.println(name);
        //Arslan
        System.out.println(sName);
        // Arslan Ali
        System.out.println(tName);
        // Arslan

        String computerName="Mac Pro";
        System.out.println(computerName+ " 2019");

        String schoolName="Techtorial";

        // length() will return number of the char in String.
        // result will be int.
        System.out.println("String length is "+schoolName.length());

        String fullName=schoolName+" Academy";
        System.out.println("Full name length is "+fullName.length());

        String userName="techtorial2400";
        int userNameLength=userName.length();
        System.out.println(userNameLength);

        // in java counting  start from the 1
        // in java indexing start from the 0

        System.out.println(userName.charAt(0)); //t
        System.out.println(userName.charAt(3)); //h
        System.out.println(userName.charAt(7)); //i
        System.out.println(userName.charAt(9)); //l
        //if u wanna find out last char from the sting
        // we need first find out the length of the string

        System.out.println(userName.charAt(userName.length()-1));
        // if in the index there is not char, java will throw an exception
        // StringIndexOutOfBoundException
        // int userNameLength=userName.length();
        // System.out.println(userNameLength);


        // middle char

        // a b c d e f g ==> 7  d = 3
        // charAt((length-1)/2)
        // charAt(length-1)

        String success="hustling";

        System.out.println(success.indexOf("s")); //2
        //indexOF will return first matching values' index
        System.out.println(success.indexOf("ling")); //4
        System.out.println(success.indexOf("k")); //-1

         //charAt will return the char from giving index. Will throw an exception length 10 --> 15th
        // indexOF will return index from giving String. If there is not matching it wil give the -1.

        String animal="Dragon Animal";

        // task find the last char from the animal
        // print the middle char from the string
        // print the first char from the string
        // find the second matching index of 'n' from the string
        // print the length of String
        // print the 20th char
        //print index of 'k'

        int lengthOfDragon=animal.length();
        System.out.println(lengthOfDragon); //6

        System.out.println(animal.charAt(animal.length()-1)); // n
        System.out.println(animal.charAt(animal.length()-1)/2); //55
        System.out.println(animal.charAt(0)); //D
        System.out.println(animal.indexOf("n",6));
        System.out.println(animal.length());
        System.out.println(animal.indexOf("k"));
        System.out.println(animal.charAt(20));







    }
}
