package Methods;

public class Cars {

    public static void main(String[] args) {

        Car car1=new Car();

        car1.make="Toyota";
        car1.model="Camry";
        car1.year=2019;
        car1.price=20000;

        Car car2=new Car();
        car2.make="Porsche";
        car2.model="Cayenne";
        car2.year=2015;
        car2.price=50000;

        car1.drive();
        car1.stop();
        System.out.println(car1.getPrice());
        car2.drive();
        System.out.println(car1.year);
        car1.changePrice(18000);
        System.out.println(car1.getPrice());
        car1.changePrice(15000);
        System.out.println(car1.getPrice());

        String name=new String();


    }
}
