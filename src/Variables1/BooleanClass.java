package Variables1;

public class BooleanClass {

    public static void main(String[] args) {

        boolean isLightOn=true;
        isLightOn=false;

        isLightOn=!true;
        System.out.println(isLightOn);

        int currentSpeed=60;
        int speedLimit=50;

        boolean increaseSpeed=currentSpeed<speedLimit; // false

        boolean decreaseSpeed=currentSpeed>speedLimit; // true

        System.out.println(increaseSpeed);
        System.out.println(decreaseSpeed);





        // avarage temp for the room is 72F
        // if current temp is less than 72F increase
        // current temp is more 72F decrease

        int currentTemp=60;
        int avarageTemp=72;
        boolean increaseTemp=currentTemp<avarageTemp;
        boolean decreaseTemp=currentTemp>avarageTemp;

        System.out.println("increase temp is "+increaseTemp);
        System.out.println("decrease temp is "+decreaseTemp);

        // sell the alcohol if person age is more than or equals to 21
        //don't sell alcohol if person age less than 21

        int personAge=18;
        int legalAge=21;

        boolean sellAlcohol=personAge>=legalAge; //18>=21; false
        boolean dontSellAlcohol=personAge<legalAge; // 18<21; true

        System.out.println("sell the alcohol "+sellAlcohol);
        System.out.println("Dont sell the alcohol "+dontSellAlcohol);

        //if you have 500.000 you can buy 5 room single house
        //if you don't have 500.000 u can't buy the 5 room single house
        // your current saving is 120000

        int ifYouHave=500_000;
        int yourSavingIs=120000;

        boolean ifBuyAHouse=ifYouHave>yourSavingIs;
        boolean buyAHouse=ifYouHave<yourSavingIs;

        System.out.println("if you have a "+ifBuyAHouse); //true
        System.out.println("If you dont have a "+buyAHouse); //false








    }
}
