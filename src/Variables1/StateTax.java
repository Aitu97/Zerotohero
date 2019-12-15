package Variables1;

public class StateTax {
    public static void main(String[] args){

        /*
        Homework 1: As an Automation Engineer,
        I am working with contract. The company paying me $60 an hour.
        If the person works 8 hours a day.
         Question 1: Calculate the annual salary of the person.
       Question 2: if the State tax is 8 percent and Federal tax is 11 percent.
       Calculate total tax amount which I need to pay.
7:52 AM
      Homework 2: if base of the triangle is 10 cm and height is 12 cm.
       Calculate the area of triangle? Formula = base*height/2;
         */

        int payAnHour=60;
        int workADay=8;

        int annualWorkHour=workADay*365;
        System.out.println("Total Annual Work hour "+annualWorkHour);

        int annualSalary=payAnHour*2920;
        System.out.println("Total Annual Salary "+annualSalary);

        double stateTax=annualSalary*8/100d;
        double federalTax=annualSalary*11/100d;

        System.out.println("Total State Tax of the Automation Engineer "+stateTax);
        System.out.println("Total Federal Tax of the Automation Engineer "+federalTax);

        double totalAnnualTax=stateTax+federalTax;
        System.out.println("Total Annual Tax "+totalAnnualTax);

        /*
        Homework 2: if base of the triangle is 10 cm and height is 12 cm.
       Calculate the area of triangle? Formula = base*height/2;
         */

        int base=10;
        int height=12;
        int totalArea=base*height/2;
        System.out.println("Total Area of Triangle "+totalArea);








    }
}
