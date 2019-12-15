package Methods;

public class BankAccount {

    String name;
    int accountNumber;
    String bankName;
    double balance;
    int expirationDate;

    public void   displayInfo (){
        System.out.println("name on the card is "+name);
        System.out.println("bank name is "+bankName);
        System.out.println("account number is "+accountNumber);
        System.out.println("your balance "+balance);
        System.out.println("expiration "+expirationDate);
    }
    public double deposit(int depositAmount){
        balance=balance+depositAmount;
        return balance;
    }
    public double withdraw(int withdrawAmount){
        balance=balance-withdrawAmount;
        return balance;
    }

    public static void main(String[] args) {
        BankAccount ba=new BankAccount();

        ba.name="Aitu";
        ba.accountNumber=123456789;
        ba.bankName="Chase";
        ba.expirationDate=2022;
        ba.balance=10;

        ba.displayInfo();

        ba.deposit(1000);
        ba.displayInfo();

        ba.withdraw(1500);
        ba.displayInfo();

    }

}
