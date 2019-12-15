package ForLoop;

public class HomeWork2 {

    public static void main(String[] args) {

        int catMeal=50;
        double eating=0.5;
        int cat=3;
        for(int i=50;i>3;i++){
            double total=cat*eating;
            double  days=catMeal/total;
            System.out.println("the cats are eating  " + days+ " days");
            break;
        }


    }
}
