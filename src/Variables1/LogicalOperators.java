package Variables1;

public class LogicalOperators {

    public static void main(String[] args) {

        boolean hasVisa=true;
        boolean hasTicket=true;

        boolean canCome=hasVisa&&hasTicket;

        System.out.println("Can i come to the usa? "+canCome);

        boolean finishedESL=false;
        int toeflScore=78;

        boolean canGoToCollege=finishedESL||toeflScore>=79;

        System.out.println("can go to college? "+canGoToCollege);




        // To be able to buy the Home I should have enough money or
        // I should have mortgage
        // Current money is 200.000
        // Home price is 300.000
        int currentMoney=300_000;
        int homePrice=300_000;

        boolean hasMortgage=false;
        // OR
        boolean hasEnoughMoney=currentMoney>=homePrice;  // False

        boolean canBuyHome=hasMortgage||hasEnoughMoney;

        System.out.println("Can I buy home? "+canBuyHome);


        //I should have driver license
        //age 16
        // should pass the exam
        // my score is 70
        // expected is 75
        // I should have visa

        int myAge=15;
        int expectedAge=16;

        boolean ageRequirement=myAge>=expectedAge; //true

        int myScore=80;
        int expectedScore=75;

        boolean passExam=myScore>=expectedScore;

        boolean hasVisa1=true;
        //age
        //score
        //visa

        boolean canGetDLicense=ageRequirement&&passExam&&hasVisa1;

        System.out.println("can i get the DL? "+canGetDLicense);







    }
}
