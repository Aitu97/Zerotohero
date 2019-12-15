package ForLoop;

import java.util.Scanner;

public class AccountBalance {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("please enter the account balance");
        int balance=input.nextInt();

      while (balance>0){
          System.out.println("please enter your transaction");
          int transaction=input.nextInt();
          if (balance<transaction){
              System.out.println("you dont have enough balance. your balance" +balance);
          }else{
              balance=balance-transaction;
              System.out.println("your new balance is: "+balance);

          }
      }

    }
}
