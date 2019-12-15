package ForLoop;

public class HourLoop {

    public static void main(String[] args) {


        for (int i=2; i<=4; i++ ){

            System.out.print(i + "hours");

            for (int n=0; n<60; n++){

                System.out.println(n+ "minutes");
            }
        }


    }
}
