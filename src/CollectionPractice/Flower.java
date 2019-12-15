package CollectionPractice;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.HashSet;

public class Flower {
   String name;
   int barcodeNumber;

    HashSet<Flower> flowers;

    public Flower(String name, int barcodeNumber){
        this.name=name;
        this.barcodeNumber=barcodeNumber;
        flowers=new HashSet<>();
    }

    public void addFlower(String name, int barcodeNumber) {
        flowers.add(new Flower(name, barcodeNumber));

        flowers.add(new Flower("rose", 23456));
        flowers.add(new Flower("tulip", 98767));
        flowers.add(new Flower("orchid", 34567));
        flowers.add(new Flower("red rose", 979797));



    }
      /*
        Create one method to find the flowers from the Set.
        this method will take one parameter as a name of the flower and it will return the barcodeNumber of the flower
//    Create one method to find the flowers from the set.
This method will take one parameter as a barcode number of the flower and it will return the name of the flower
//    Create one method to remove the flower from the set and with flower name.
//    Create one method to print all the flower name from the Set.
//    Create FlowerTest to test your application, create one object from the Flower class and store the ten flowers to your list.

       */

      public  int findFlower(String name){
          for (Flower f: flowers){
              if (f.name.equalsIgnoreCase(name)){
                  return f.barcodeNumber;
              }
          }
          System.out.println("this flower is not available");
          return 0;

      }
      public String  findFlower1(int barcodeNumber){
          for (Flower f: flowers){
              if (f.barcodeNumber==barcodeNumber){
                  return f.name;
              }
          }
          System.out.println("this barcodeNumber is not available");
          return null;
      }

      public void removeFlower(String name) {

          ArrayList<Flower> flowersList = new ArrayList<>(flowers);
          for (int i = 0; i < flowersList.size(); i++) {
              if (flowersList.get(i).name.equalsIgnoreCase(name)) {
                  flowersList.remove(flowersList.get(i));
              }
          }
          flowers = new HashSet<>(flowersList);

         /* for (Flower f: flowers){
              if (f.name.equalsIgnoreCase(name)){
                  flowers.remove(f);
              }
          }
      }

          */
      }

      public void printAllFlower(){
          for (Flower f: flowers){
              System.out.println(f.name);
          }
      }



}
