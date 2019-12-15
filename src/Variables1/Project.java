package Variables1;

public class Project {
    public static void main(String[] args) {

        int hour=60;
        int day=24;
        int year=365;
        double totalMinInDay=day*hour;
        System.out.println(totalMinInDay);

        double totalMinYear=hour*day*year;
        System.out.println("total in one year "+totalMinYear);

        int min=1;
        double minToYear=min/totalMinYear;
        System.out.println("Min to year "+minToYear);


        // Convert years to seconds. 0.1, 1, 5, 1000, 1980, 1991, 2019, 2021, 11111, 999999000000
        double minuteInHour=60;
        double hoursInDay=24;
        double daysInYear=365;
        double minuteInDay=minuteInHour*hoursInDay;
        double minuteInYear=minuteInDay*daysInYear;
        System.out.println("minutes in one day" + minuteInDay);
        System.out.println("minutes in one year is "+minuteInYear);
        double oneMinute=1/minuteInYear;
        System.out.println("one min is "+oneMinute+ " years");
        double $100min=100/minuteInYear;
        System.out.println("100 mins is "+$100min +" years");
        double $1000min=1000/minuteInYear;
        System.out.println("1000 mins is "+$1000min +" years");
        double $11111min=11111/minuteInYear;
        System.out.println("11111 mins is"+$11111min+" years");
        double $9999999000000=999999000000f/minuteInYear;
        System.out.println("999999000000 mins is "+$9999999000000+" years");


        //converting years to seconds

        int secondsInMin=60;
        int minInHour=60;
        int hourInDay=24;
        int dayInYear=365;
        double totalSeconds=secondsInMin*minInHour;
        System.out.println("total seconds "+totalSeconds);
        double totalMin=minInHour*dayInYear;
        System.out.println("total min" +totalMin);
        double totalHour=hourInDay*dayInYear;
        System.out.println("total hour "+totalHour);




    }

}
