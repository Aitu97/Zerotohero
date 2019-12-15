package ConstructorPractice;

import ArrayListPackage.AnimalClass;

import java.util.ArrayList;

public class AnimalClassTest {

    public static void main(String[] args) {

     // AnimalClass animalClass=new AnimalClass();

        AnimalClass animalClass1=new AnimalClass("boss", 4, "San Francisco", 2);
        AnimalClass animalClass2=new AnimalClass("dog", 1, "LA", 4);
        AnimalClass animalClass3=new AnimalClass("lion", 2, "chicago", 5);
        AnimalClass animalClass4=new AnimalClass("monkey", 3, "Arizona", 6);
        AnimalClass animalClass5=new AnimalClass("tiger", 5, "San Diego", 7);

        System.out.println(animalClass5.dailymeal);

        ArrayList<AnimalClass> animalList=new ArrayList();

        animalList.add(animalClass1);
        animalList.add(animalClass2);
        animalList.add(animalClass3);
        animalList.add(animalClass4);
        animalList.add(animalClass5);

        for (int i=0; i<animalList.size(); i++){

           // animalList.get(i)
        }




    }
}
