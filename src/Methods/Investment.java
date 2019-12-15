package Methods;

public class Investment {

    double years;
    double amount;
    double rate;

    public double rateAmount(){
        return amount*rate*years/100; // 100*5*2 / 1000/100 -> 10
    }
    public double totalAmount(){
        return rateAmount()+ amount; //100 + 10 -> 110
    }

}
