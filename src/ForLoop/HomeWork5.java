package ForLoop;

public class HomeWork5 {

    public static void main(String[] args) {


        for (int i=100; i<200; i++){
            if (i%11==0)
            System.out.print(i+ ", ");
        }

        int result=0;
        for (int i=100; i<=200; i++) {
            if (i % 11 == 0)
                result += i;
        }
            System.out.println("expected result is "+result);

     }
}
