package Variables1;

public class ApplePriceCalculator {



       public static void main(String[] args) {
            // apple price in Fresh Market is 1$
            int appleFreshMarket=20;
            //apple price in Whole Food is 3$
            int appleWholeFood=13;
            //int totalAppleNumber=12+7;
            int totalAppleNumber=appleFreshMarket+appleWholeFood;
            System.out.println("My total apple number is "+totalAppleNumber);
            int freshMarketPayment=appleFreshMarket*1;
            int wholeFoodPayment=appleWholeFood*3;
            System.out.println("Total payment for fresh Market is $"+freshMarketPayment);
            System.out.println("Total payment for whole foods is $"+wholeFoodPayment);
            int totalPayment=freshMarketPayment+wholeFoodPayment;
            System.out.println("Total payment is $"+totalPayment);
            System.out.println(freshMarketPayment+wholeFoodPayment);
            System.out.println("20 "+"39");
            System.out.println("20"+wholeFoodPayment);
            //decimal number for 'A' is 65
            // in int we can not store the character that's why it will automatically convert
            // character to decimal
            int A='A';
            System.out.println(A);
            //20 39

            //you can start variables with underscore_ and $ or letter
            int dateYear=1998;
            //you can end variable names with number
            //you can not use same name two times
            int dateYear1=2000;

            int maxNumber=Integer.MAX_VALUE;
            System.out.println("Max number for integer "+maxNumber);

            //2147483647

            int number=2147483647;
            int minNumber=Integer.MIN_VALUE;

            System.out.println("Min number for integer is "+minNumber);
             //-2147483648





        }
    }


