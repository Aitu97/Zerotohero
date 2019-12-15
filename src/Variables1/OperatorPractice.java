package Variables1;

public class OperatorPractice {

    public static void main(String[] args) {

        // Re-assigning the variables

        /* Variables can be assigned and re-assigned
        many times after declaring

         */

        int apple=7, banana, orange=13;

        banana=12;
        banana=1;
        banana=4;
        // java will see only last we did banana
        System.out.println(banana);

        banana=8;

        System.out.println("banana number is "+banana);

        banana=apple;
        // its gonna be same of the apple's number
        apple=banana;
        //b

        System.out.println(banana);
        System.out.println(apple);
        System.out.println(orange);

        banana=banana+1;
        System.out.println("banana number is" +banana);
        banana=orange+1;
        System.out.println("banana number is "+banana);

        banana+=1;
        //it it same as banana = banana+1
        // banana=15
        System.out.println("banana number is "+banana);

        banana-=2;
        // banana= banana-2;
        //banana= 15-2;
        //banana=13;
        System.out.println("banana number is "+banana);

        banana*=2;
        // banana=banana*2;
        //banana=13*2;
        //banana=26;
        System.out.println("banana number is "+banana);

        orange%=5;
        //orange = orange%5;
        //5+5+3
        //orange=3
        System.out.println("orange number is "+orange);

        double taxAmount=10.5;
        float salary=40.7f;
        int number=100;
        //

        // totalAmount=taxAmount+number;
        double totalAmount=taxAmount+number+salary;

        byte k=10;
        short n=8;
        int totalNumber=k+n;
        // totalNumber=k*n;
        // totalNumber=k-n;
        // totalNumber=k%n;
        // totalNumber=k/n;

        int berry=14;
        System.out.println(berry);

        berry=++berry;
        System.out.println(berry);
        // if its after berry=berry++;
        //equal for berry=14 still
        //if it before berry=++berry;
        //it will be berry=15;

        berry=++berry;
        System.out.println(berry);











    }

}
