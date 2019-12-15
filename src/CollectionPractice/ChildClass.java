package CollectionPractice;

import java.util.Set;

public class ChildClass {

    private String name;
    private int age;
    private char gender;
    private String city;

    public ChildClass(String name, int age, char gender, String city){
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.city=city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean goToSchool() {

        if (age > 6) {
            System.out.println("child can go to school ");
            return true;
        }
        System.out.println("child can not go to school");
        return false;
    }
    public boolean isPalindrome(String str) {
        boolean palindrome = false;
        int k = str.length() / 2;
        for (int i = 0; i < k; i++) {
            if (str.charAt(i) == str.charAt(str.length() - i - 1)) {
                return true;
            }
        }
        if (palindrome) {
            return true;
        }
        return false;


    }
}



