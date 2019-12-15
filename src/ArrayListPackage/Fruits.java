package ArrayListPackage;

import java.util.ArrayList;

import java.util.Scanner;

public class Fruits {

        public static void main(String[] args) {

            Scanner input=new Scanner(System.in);

            ArrayList <String> fruits=new ArrayList();

            System.out.println("Provide fruits?");

            int count=5;

            for(int i=0;i<5;i++){

                fruits.add(input.nextLine());

                count--;

                System.out.println(count+ "u can enter fruits");
            }
            System.out.println(fruits);

            System.out.println();

            //make all your fruits upper case
            // for loop get() method, uppercase(), set()

            for (int i=0; i<fruits.size(); i++){

               fruits.set(i,fruits.get(i).toUpperCase());
            }

            System.out.println(fruits);

            //task
            //loop through your arrayList and print the element if it is start with "B"

            for ( String fruit : fruits) {
              if(fruit.startsWith("B")){

                  System.out.println(fruit);

              }
                System.out.println();
            }





        }

    }

