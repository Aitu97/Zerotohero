package Variables1;

public class Animal {

    /*
    in farm we have 23 cow and 42 chicken
    Calculate the total number of leg in this farm

    one cow price is 2000$
    one chicken price is 20$
    calculate total price for all animals in the farm
     */

    public static void main(String[] args) {



        int cow=23;
        int totalCow=cow*4;
        int oneCowPrice=2000;

        int chicken=42;
        int totalChicken=chicken*2;
        int oneChickenPrice=20;

        int total2=cow*oneCowPrice+chicken*oneChickenPrice;

        int total1=totalCow+totalChicken;




        System.out.println("Enter how many"+ "totalCow+ "+" totalChicken "+total1);

        System.out.println("Enter how much"+total2);


    }
}
