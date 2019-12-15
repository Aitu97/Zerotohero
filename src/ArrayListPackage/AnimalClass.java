package ArrayListPackage;

public class AnimalClass {

    public boolean dailymeal;
    String name;
     int age;
     String area;
     int dailyMeal;

     public AnimalClass(){

     }

     public AnimalClass(String name, int age, String area, int dailyMeal){
         this.name=name;
         this.age=age;
         this.area=area;
         this.dailyMeal=dailyMeal;
     }

     public void  meal(){
         dailyMeal +=10;
     }


}
