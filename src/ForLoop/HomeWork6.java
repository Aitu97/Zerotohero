package ForLoop;

public class HomeWork6 {

    public static void main(String[] args) {

        int sum=0;

        int square;

        for (int i=1; i<=5; i++){

            square=i*i;

            System.out.print(square+ ", ");
            sum+=square;
        }
        System.out.println("\n Sum of the numbers are "+sum);


    }
}
