package ArrayListPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Birds {

    public static void main(String[] args) {

        List<String> birdList=new ArrayList<String>();

        birdList.add("Owl");
        birdList.add("Parrot");
        birdList.add("Penguin");

      Object[] listOfBirds=birdList.toArray(); // to array method will return the array.

        List<Integer> number=new ArrayList<>();

        number.add(10);
        number.add(11);
        number.add(55);

      Object [] numList= number.toArray();

        // if u are converting from ArrayList to Array using toArray() method
        // u can only store as a object of the array.
        // toArray() method will return the object.


        ///////////////////////////////////

        String [] city={"Chicago", "New York", "San Francisco"};
        System.out.println(city.length);

        List<String> cityNames= Arrays.asList(city);
        System.out.println(cityNames.size());

       // cityNames.add("Los Angeles");
        System.out.println(cityNames.size());
        //ArrayList is not fixed size.
        // however if u convert from Array to ArrayList, ArrayList size will be fixed

        List<String > cityNames1=new ArrayList<>(cityNames);
        System.out.println(cityNames1.get(0));

        cityNames1.add("Los Angeles");
        System.out.println(cityNames1);

        //TASK
        //change all the element of cityNames1 with uppercase String

        for (int i=0; i<cityNames1.size(); i++){
            cityNames1.set(i, cityNames1.get(i).toUpperCase());
        }
        System.out.println(cityNames1);






    }
}
