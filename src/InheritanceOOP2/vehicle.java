package InheritanceOOP2;

public class vehicle extends Object{

    String make;
    int year;

    public vehicle(){
        super();
    }

    public vehicle(String make){
        this();
        this.make=make;
        System.out.println("Constructor 2");
    }

    public vehicle(String make, int year){
        this(make);
        this.year=year;
        System.out.println("Constructor 3");
    }

    public static void main(String[] args) {

        vehicle v=new vehicle();
        vehicle v2=new vehicle("Toyota", 2018);
    }
}
