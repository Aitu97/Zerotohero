package ForLoop;

public class FibonacciNumber {

    public static void main(String[] args) {

        //sum of the first two number is equals to next number
        // start point is 0 , 1

        int num1=0, num2=1, sum=0;
        System.out.println(num1+ " "+num2);
        //0 1 1 2 3 5
        for (int i=1; i<8; i++){// 2
            sum=num1+num2;//1 //2
            num1=num2;// 1
            num2=sum; // num2=1 //num2=2;
            System.out.println(" "+ sum);
        }

    }
}
