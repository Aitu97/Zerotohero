package CollectionPractice;

import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapPractice {

    public static void main(String[] args) {

        TreeMap<String,String>  phoneList=new TreeMap<>();

        phoneList.put("Muammer", "123345567");
        phoneList.put("Aitu", "3235979088");
        phoneList.put("David", "1987665443");
        phoneList.put("James", null);



        System.out.println(phoneList);



    }
}
