package InterfaceOOP;

public class Plane implements Flyable,Sound {
    @Override
    public void fly() {
        System.out.println("plane is flying");

    }

    @Override
    public void makeNoise() {
        System.out.println("plane is making noise");

    }
}
