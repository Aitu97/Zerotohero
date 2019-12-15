package CollectionPractice;

import java.util.LinkedHashMap;
import java.util.Set;

public class ChildTest {

    public static void main(String[] args) {

        ChildClass child1=new ChildClass("Civic", 10, 'M', "San Francisco");
        ChildClass child2=new ChildClass("mom", 5, 'M', "Los Angeles" );
        ChildClass child3=new ChildClass("David", 4,  'M', "Michigan" );
        ChildClass child4=new ChildClass("Jennifer", 5,'M',"Miami" );
        ChildClass child5=new ChildClass("John", 1, 'M', "San Jose" );

        System.out.println(child1.getName());

        LinkedHashMap<Integer,ChildClass> childMap=new LinkedHashMap<>();

        childMap.put(1, child1);
        childMap.put(2, child2);
        childMap.put(3, child3);
        childMap.put(4, child4);
        childMap.put(5, child5);

        Set<Integer> keyList=childMap.keySet();

        for (Integer c: keyList){
            System.out.println(childMap.get(c).getName());
            System.out.println(childMap.get(c).goToSchool());
            System.out.println(childMap.get(c).isPalindrome(childMap.get(c).getName()));
        }




    }
}
