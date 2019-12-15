package CollectionPractice;

import java.util.Iterator;
import java.util.TreeSet;

public class LinkedHashset {
    public static void main(String[] args) {


        TreeSet<String> eventAttendanceList = new TreeSet<String>();
        eventAttendanceList.add("Mike");
        eventAttendanceList.add("Jennifer");
        eventAttendanceList.add("John");
        eventAttendanceList.add("David");
        //eventAttendanceList.add(null)

        System.out.println(eventAttendanceList);


        // TreeSet follows the ascending order
        //TreeSet does not accept the null values
        // it will give the null exception

        Iterator<String >i=eventAttendanceList.descendingIterator();
        while (i.hasNext()){
            System.out.println(i.next()+" ");
        }

      //  System.out.println(eventAttendanceList.descendingIterator());

        System.out.println();

        System.out.println(eventAttendanceList);

        eventAttendanceList.pollFirst();

        System.out.println(eventAttendanceList);

        eventAttendanceList.pollLast();

        System.out.println(eventAttendanceList);





    }
}
