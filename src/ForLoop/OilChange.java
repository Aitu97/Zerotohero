package ForLoop;

public class OilChange {

    public static void main(String[] args) {

        int count=0;
        int count1=0;

        for (int oil=0; oil<4; oil++){

            System.out.println(count++ +" - please change the oil");

            for (int gas=0; gas<4; gas++){

                System.out.println(count1++ +" - please full the tank");
            }
        }
    }
}
