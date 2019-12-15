package CollectionPractice;

import java.util.Map;
import java.util.SplittableRandom;

public class LinkedHashMap {

    public static void main(String[] args) {

        // Synchroni
        //ot will follow incertional order

        Map <Integer, String> studentList = new java.util.LinkedHashMap<>();
        studentList.put(1, "Muammer");
        studentList.put(2, "David");
        studentList.put(3, "John");

        System.out.println(studentList);
    }
}
