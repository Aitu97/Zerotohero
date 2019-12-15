package CollectionPractice;

import java.util.HashMap;
import java.util.Hashtable;

public class HashTablePractice {

    public static void main(String[] args) {

        Hashtable<Integer,Boolean> truthList=new Hashtable<>();

        truthList.put(123, true);
        truthList.put(345, false);
        truthList.put(677, true);
        truthList.put(979, false);

        System.out.println(truthList);


    }
}
