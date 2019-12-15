package ForLoop;

public class CharLoop {

    public static void main(String[] args) {

        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch + ",");
        }

        int i = 0;
        for (; i < 8; i++) {
            System.out.println(i);
        }
        for (int k = 0; k < 5; k++) {
            int num = 5;
            num++;
            // since num is inside loop, I can not use it outside of loop
            System.out.println(num);// compile time error because, num is inside of the loop
        }
        //you can not use the variables outside of the loop, if you declare them inside loop.
        // if you declare the variables of the loop, you can use them inside loop.
        int s=0;
        long d=10;
        for (s=2, d=7; s<d; s++){
            System.out.println("hello");
        }
    }
}
