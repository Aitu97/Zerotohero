package WhileLoop;

public class WhileLoopPractice {

    public static void main(String[] args) {

        int age=20;

        while(age<26){
            System.out.println("complete circle"); // 21, 22, 23, 24, 25, 26;
            age++;

        }
        // i wanna print my name 5 times
        int repeatNumber=5;
        int currentNumber=1;
        while (currentNumber<=repeatNumber){
            System.out.println("Aitu");
            currentNumber++;
        }

        // 40$ in my phone account
        // every call 5$ how many time i can call
        // i can call
        int totalAmount=40;
        int oneCall=5;
        //int restAmount=40; //40-5, 35-5
        while (totalAmount>0){
            System.out.println("i can call");
            totalAmount=totalAmount-5; //35 /30 /25 /20 /15 /10/ /5 /0

        }
        //

        int meal=10;

        int spoon=1;

        while(meal>spoon){
            System.out.println(spoon+"one spoon");
            spoon++;
        }

        //ZERO LOOP ITERATION
        //if your boolean condition is returning  false. there will no any iteration
        //you wanna buy the phone. phone price is 800
        //you have 400$
        //how may times u can buy phone

        int phonePrice=800;
        int currentMoney=400;

        while (currentMoney>phonePrice){
            System.out.println("you can buy the phone");
        }

        // INFINITE LOOP
        //IF YOUR BOOLEAN CONDITION IS TRUE, YOU WILL BE EXECUTING YOUR CODE INFINITE

        int phonePrice2=800;
        int currentMoney2=800;
        int count=0;

        while (currentMoney2>phonePrice2){
            System.out.println(count+ "you can buy the phone");
            count++;
        }
        // less then one min java gives us more than 50million


        int phonePrice3=300;
        int currentMoney3=2000;
        int count1=1;

        while (currentMoney3>=phonePrice3){
            System.out.println(count1+ " I can buy");
            currentMoney3=currentMoney3-phonePrice3; //2000-500=1500
            count1++;
        }




    }
}
