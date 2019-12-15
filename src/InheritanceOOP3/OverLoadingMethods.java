package InheritanceOOP3;

public class OverLoadingMethods {

    public Number getNumber( Number num){
        System.out.println("my parameter is Number");
        return 1;
    }

    protected static Integer getNumber(Integer num){
        System.out.println("my parameter is Integer ");
        return 2;
    }
   public static Double getNumber(Double num){
        System.out.println("my parameter is double");
        return 3.1;
    }

    public static void main(String[] args) {
        getNumber(3);
        getNumber(3.12);
    }

}
