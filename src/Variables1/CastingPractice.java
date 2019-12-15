package Variables1;

public class CastingPractice {

    public static void main(String[] args) {

        short samsung=1000;
        short apple=900;
        // Casting primitive data types

        short totalPrice=(short)(samsung+apple);

        //byte, short, int and long is called integral values
        //float and double is called floating point number
        long studentNumber=1200;
        // we need to cast the longer values to smaller value

        int studentNumber1=(int)studentNumber;
        long num=studentNumber1;

        double st=num;
        double K=800.7d;
        int L=(int)K;

        System.out.println("the L is "+L);

        int x=12;
        int y=5;
        x*=y; // compound assignments x=x*y; 50  x=x+y; 15
              // x=x/y; 2  ,, x=x%y;  x++,  x+1,  x+=1;
        System.out.println(x);

        long l=5;
        int h=8;

        int ln=(int)l*h;  //40

        //1differences between "l*h" you need to explicity cast the value
        //2 if you are using h*=l you dont need to cast explicity

        h*=l;

        byte bookNumber=15;
        int bookPrice=5;
        bookNumber=(byte)(bookNumber*bookPrice);
        System.out.println(bookNumber);








    }
}
