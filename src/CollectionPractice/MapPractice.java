package CollectionPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapPractice {

    public static void main(String[] args) {

        Map mapList=new HashMap();
        Map <Integer, String> employeeList=new HashMap<>();
        employeeList.put(1234, "Aitu");
        employeeList.put(1235, "David");
        employeeList.put(1236, "Kushal");
        employeeList.put(1237, "Priyanka");
        employeeList.put(1238, "Priyanka");
        //i can store same values.
        //but Key should be unique.
        //if you provide with same Key and different value
        // it will update the value for the Key


        HashMap<Integer, String> ticketMasterEmp= new HashMap<>();
        ticketMasterEmp.putAll(employeeList);
        //get() method it will get the key as a parameter and it will return the value
      String empName=  ticketMasterEmp.get(1234);
        System.out.println(empName);
        System.out.println(ticketMasterEmp);
        ticketMasterEmp.remove(1236);
        System.out.println(ticketMasterEmp);

        //method called keySet() it will return Set of all the keys from map

        Set<Integer> empId=ticketMasterEmp.keySet();

        for (Integer id : empId) {
            System.out.println("name of the emp is "+ticketMasterEmp.get(id));

        }
        for (Integer id: empId){
            System.out.println("ID of the employee is "+id);
        }






    }
}
