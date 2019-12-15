package ForLoop;

public class ProductNumber {

    public static void main(String[] args) {

        //Explanation:
        //given a positive int number n, your task is
        // to calculate the difference between the product of its digits
        //and the sum of its digits.

        int number=12345;

        int product=1;

        int sum=0;

        while (number>0){
            System.out.println(number%10);

            product*=number%10;
            sum+=number%10;
            number=number/10;
        }
        System.out.println(product-sum);




        }

    }

