package InterfaceOOP;

import javax.crypto.Mac;

public class Example {
    public static void main(String[] args) {

        Bird bird=new Bird();
        bird.fly();
        bird.makeNoise();

        Plane plane=new Plane();
        plane.fly();
        plane.makeNoise();

        Macy macy=new Macy();
        System.out.println(macy.countEmployees());
        macy.displayItem();


    }
}
