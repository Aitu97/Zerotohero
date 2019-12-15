package CollectionPractice;

import java.util.ArrayList;
import java.util.HashSet;

public class ConvertionSet {

    public static void main(String[] args) {

        ArrayList<String > singerList=new ArrayList<>();

        singerList.add("Drake");
        singerList.add("Michael");
        singerList.add("Cardi B");
        singerList.add("Beyonce");
        singerList.add("Drake");

        System.out.println("this is arrayList "+singerList);

        HashSet<String> singerList1=new HashSet<String >(singerList);

        System.out.println("this is set "+singerList1);

        singerList=new ArrayList<>(singerList1);
       // singerList.add("Drake");

        System.out.println("this is after converting "+singerList);

        System.gc();


    }
}
