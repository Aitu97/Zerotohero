package StringPackage;

public class MethodChaining {

    public static void main(String[] args) {

        String city="Des Plaines   ";

        System.out.println(city.substring(4).toUpperCase().replace("P", "T").trim());

        System.out.println(city.indexOf("P"));

        // after following method we can do method changing
        // substring to upperCase, toLowerCase, Replace, Trim
        // after following methods we can NOT do method chaining
        // length, charAt, indexOf, contains, equals, equalIgnoreCase, startWith, endWith
        // number, char, number, true/false,


    }
}
