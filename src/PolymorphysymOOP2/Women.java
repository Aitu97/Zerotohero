package PolymorphysymOOP2;

public class Women extends Human implements Mother{

    @Override
    public void eat(){
        System.out.println("woman is eating");
    }

    @Override
    public void walk(){
        System.out.println("woman is walking");
    }

    public void makeUp(){
        System.out.println("woman is doing makeup");
    }

    @Override
    public void takeCare() {
        System.out.println("mother is taking care of her family");
    }
}

